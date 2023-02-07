#!/usr/bin/bash

# this generates everything needed for a table

# cp from Credit, give new name
main_path='./src/main/java/com/project/'
ent='entity/'
rep='repository/'
sr='service/'
im='impl/'
con='controller/'

# use options to remove files
while getopts d OPTION
do
    case ${OPTION} in
        d)
            shift
            echo "deleting files for $1"
            rm "${main_path}${ent}$1Entity.java"
            rm "${main_path}${rep}$1Repository.java"
            rm "${main_path}${sr}$1Service.java"
            rm "${main_path}${sr}${im}$1ServiceImpl.java"
            rm "${main_path}${con}$1Controller.java"
            exit 0
            ;;
        ?)
            echo 'Invalid option.' >&1
            exit 1
            ;;
    esac
done

# get table name
echo "making files for the $1 table"
echo "first arg is $1"

generate_local_paths () {
    if [[ $n == 'ServiceImpl' ]]
    then
        echo $sr$im
    else
        echo "$n/" | tr '[:upper:]' '[:lower:]' 
    fi
}

loop_over_types () {
    echo 'looping'
    for n in Entity Repository Service ServiceImpl Controller;
    do

        # local_dir=generate_local_paths
        # I should execute a command saved to a var here
        # $(repeated_command)
        # echo "first arg is $1"
        # echo "second arg is $2"
        # echo "${main_path}$(generate_local_paths)$1$n.java"

        # repeated_command="cp \"${main_path}${local_dir}Credit$n.java\" \"${main_path}${local_dir}$1$n.java\""

        # if passed copy
        if [[ $2 == 'c' ]]
        then
            cp "${main_path}$(generate_local_paths)Credit$n.java" "${main_path}$(generate_local_paths)$1$n.java"
        else
            lc=$(echo $1 | tr '[:upper:]' '[:lower:]')
            sed -i "s/Credit/$1/g" "${main_path}$(generate_local_paths)$1$n.java"
            sed -i "s/credit/$lc/g" "${main_path}$(generate_local_paths)$1$n.java"
        # else replace
        fi
    done
}

loop_over_types $1 'c'
loop_over_types $1

if [[ $? -ne 0 ]]
then
    echo 'bad juju'
fi
