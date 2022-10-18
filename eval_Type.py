import subprocess

def run_job(cmd):
    ret = subprocess.run(cmd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
    return ret.stdout.decode(('UTF-8'))
    
if __name__ == '__main__':
    # Compile
    run_job("javac -encoding utf-8 Type.java")

    # Run
    answer = "byte a: 12\nshort b: 123\nint c: 12345\nlong d: 123456789\nchar e: A\nfloat f: 12.34\ndouble g: 123.456\nboolean h: false"

    msg = run_job("java Type").rstrip()
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
