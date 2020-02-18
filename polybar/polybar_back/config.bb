[bar/example2]
width = 100%
height = 27
radius = 0
fixed-center = false

background = #1E272B
foreground = #EAD49B

line-size = 3
line-color =

border-size = 0
border-color =

padding-left = 0
padding-right = 2

module-margin-left = 1
module-margin-right = 2

font-0 = "Source Code Pro Semibold:size=10;1"
font-1 = "Font Awesome 5 Free:style=Solid:size=10;1"
font-2 = "Font Awesome 5 Brands:size=10;1"

modules-left = i3
modules-center = date
modules-right = wlan eth 

;tray-position =
;tray-padding =
wm-restack = i3
override-redirect = false

cursor-click = pointer
cursor-scroll = ns-resize

[module/i3]
type = internal/i3
format = <label-state> <label-mode>
index-sort = true
wrapping-scroll = false

label-mode-padding = 2
label-mode-foreground = #1E272B
label-mode-background = #78824b

label-focused = %index%
label-focused-background = #78824b
label-focused-foreground = #8e2e6a
label-focused-padding = 2

label-unfocused = %index%
label-unfocused-background = #78824b
label-unfocused-foreground = #1E272B
label-unfocused-padding = 2

label-visible = %index%
label-visible-background = #78824b
label-visible-foreground = #1E272B
label-visible-padding = 2

label-urgent = %index%
label-urgent-background = #BA2922
label-urgent-padding = 2

[module/wlan]
type = internal/network
interface = wlp7s0
interval = 3.0

format-connected = <ramp-signal> <label-connected>
format-connected-foreground = #9d6a47
format-connected-background = #9d6a47
format-connected-padding = 2

format-disconnected =

ramp-signal-0 = 😱
ramp-signal-1 = 😠
ramp-signal-2 = 😒
ramp-signal-3 = 😊
ramp-signal-4 = 😃
ramp-signal-5 = 😈
ramp-signal-foreground = #1E272B

; Only applies if <animation-packetloss> is used
animation-packetloss-0 = ⚠
animation-packetloss-0-foreground = #9d6a47
animation-packetloss-1 = 📶
animation-packetloss-1-foreground = #1E272B
; Framerate in milliseconds
animation-packetloss-framerate = 500

format-packetloss = <animation-packetloss> <label-connected>


label-connected = %essid% %downspeed:9%
label-connected-foreground = #eefafafa

label-disconnected = not connected
label-disconnected-foreground = #c7f2e3

[module/eth]
type = internal/network
interface = enp8s0
interval = 3.0

format-connected-padding = 2
format-connected-foreground = #9d6a47
format-connected-background = #9d6a47
format-connected-prefix = " "
format-connected-prefix-foreground = #1E272B
label-connected = %local_ip%

format-disconnected =

[module/date]
type = internal/date
interval = 5

date =
date-alt = " %Y-%m-%d"

time = %H:%M
time-alt = %H:%M:%S

format-prefix = 
format-foreground = #1E272B
format-background = #d99f57
format-padding = 2

label = %date% %time%

[module/powermenu]
type = custom/menu

expand-right = true

format-spacing = 1

label-open = 
label-open-foreground = #9d6a47
label-close =  cancel
label-close-foreground = #9d6a47
label-separator = |
label-separator-foreground = #9d6a47

menu-0-0 = reboot
menu-0-0-exec = menu-open-1
menu-0-1 = power off
menu-0-1-exec = menu-open-2
menu-0-2 = log off
menu-0-2-exec = menu-open-3

menu-1-0 = cancel
menu-1-0-exec = menu-open-0
menu-1-1 = reboot
menu-1-1-exec = reboot

menu-2-0 = power off
menu-2-0-exec = poweroff
menu-2-1 = cancel
menu-2-1-exec = menu-open-0

menu-3-0 = log off
menu-3-0-exec = pkill -KILL -u $USER
menu-3-1 = cancel
menu-3-1-exec = menu-open-0

[settings]
screenchange-reload = true

[global/wm]
margin-top = 0
margin-bottom = 0
