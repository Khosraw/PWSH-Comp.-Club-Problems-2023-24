import os
import time

no_of_times_the_commit_runs = 0
max_no_of_times_the_commit_runs = 200
delay_timer_to_wait_for_adding_files_to_stage = 2
git_branch_to_push_the_code = "main"

for i in range(no_of_times_the_commit_runs, max_no_of_times_the_commit_runs):
 commit_message = f"Code committed_{no_of_times_the_commit_runs}" # It will change the current file, so that it can be added to the Git Stage
 time.sleep(delay_timer_to_wait_for_adding_files_to_stage)
 os.system("git add .")
 time.sleep(delay_timer_to_wait_for_adding_files_to_stage)
 os.system(f'git commit -m "${commit_message}"')
 os.system(f"git push origin {git_branch_to_push_the_code}")