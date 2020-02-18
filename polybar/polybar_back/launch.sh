killall -q polybar

while gprep -u $UID -x polybar >/dev/null; do sleep 1; done

polybar example
