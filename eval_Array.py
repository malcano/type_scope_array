import subprocess

def run_job(cmd):
    ret = subprocess.run(cmd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
    return ret.stdout.decode(('UTF-8'))
    
if __name__ == '__main__':
    # Compile
    run_job("javac -encoding utf-8 Array.java")

    # Run
    answer = "a:\n0, 1, 2, 3, 4, 5, 6, 7, 8, 9\nb:\n0, 1\n2, 3\n4, 5\n6, 7\n8, 9"

    msg = run_job("java Array").rstrip()
    msg = "\n".join(msg.splitlines())

    if msg == answer:
        print("OK")
    else:
        print("Error. The correct answer is:") 
        print("============================")
        print(answer)
        print("============================")
        print("but your outupt is:")
        print("============================")
        print(msg)
