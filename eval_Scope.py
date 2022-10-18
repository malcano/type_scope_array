import subprocess

def run_job(cmd):
    ret = subprocess.run(cmd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
    return ret.stdout.decode(('UTF-8'))
    
if __name__ == '__main__':
    # Compile
    run_job("javac -encoding utf-8 Scope.java")

    # Run
    answer = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10"

    msg = run_job("java Scope").rstrip()
    msg = "\n".join(msg.splitlines())
    if msg == answer:
        print("OK")
    else:
        print("Error. The correct answer is:") 
        print("============================")
        print(answer)
        print("============================")
        print("but your outupt is:")
        print(msg)
