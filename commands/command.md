# 安装后配置

```
sudo pacman -Syy

sudo pacman-mirrors -i -c China -m rank  #选一个清华源就行

sudo pacman -Syyu
```

### 先安装vim

```
sudo pacman -S vim
```

### 添加arch源

```
sudo vim /etc/pacman.conf
```

把下边这个添加进去

```
[archlinuxcn]
SigLevel = Optional TrustedOnly
Server = https://mirrors.ustc.edu.cn/archlinuxcn/$arch
```

然后

```
sudo pacman -Syy && sudo pacman -S archlinuxcn-keyring
```

### 安装zsh

```
sudo pacman -S git

sudo pacman -S zsh

sh -c "$(curl -fsSL https://raw.github.com/robbyrussell/oh-my-zsh/master/tools/install.sh)"

chsh -s /bin/zsha
```

### 更换输入法

```
sudo pacman -S fcitx-lilydjwg-git fcitx-sogoupinyin fcitx-im fcitx-configtool
```

设置中文输入法环境变量，编辑~/.xprofile文件，增加下面几行(如果文件不存在，则新建)

```
修改/etc/profile文件，文本尾部追加

export XIM_PROGRAM=fcitx
export XIM=fcitx
export GTK_IM_MODULE=fcitx
export QT_IM_MODULE=fcitx
export XMODIFIERS="@im=fcitx"
```

### 然后安装我常用的软件

```
sudo pacman -Sy yaourt yay
sudo pacman -S archlinuxcn-keyring
sudo pacman -S wiznote qtcreator visual-studio-code-bin make deepin.com.qq.office clang go electronic-wechat-git gbd flameshot google-chrome firefox dbeaver lightdm redshift deepin gnome alacritty compton variety rofi audacious teamviewer vlc vmware-workstation baidunetdisk telegram-desktop gimp anki filezilla foxit ranger zookeeper docker npm redis redis-desktop-manager nginx php tomcat8 apache maven simplescreenrecorder qv2ray v2ray tmux timeshift wechat-devtools wine polybar rxvt-unicode alsa-utils mate-power-manager fzf  shellcheck urxvt 

i3wm桌面下,下载deepin,xfce4,gnome桌面,本人爱好i3wm和xfce4结合起来,提升桌面美观度和效率.

yay -Sy netease-cloud-music typora postman obs-Studio 

sudo pacman -S wps-office-cn
sudo pacman -S ttf-wps-fonts

#设置代理
google-chrome --proxy-server=...

sudo pacman -S ttf-roboto noto-fonts ttf-dejavu nerd-fonts-complete
# 文泉驿
sudo pacman -S wqy-bitmapfont wqy-microhei wqy-microhei-lite wqy-zenhei
# 思源字体
sudo pacman -S adobe-source-code-pro-fonts 
sudo pacman -S adobe-source-sans-pro-fonts
sudo pacman -S adobe-source-serif-pro-fonts
sudo pacman -S adobe-source-han-sans-cn-fonts   
sudo pacman -S adobe-source-han-serif-cn-fonts  
sudo pacman -S font-awesome-5
sodu fc-cache -fv 生成字体缓存

```

anaconda激活

```
在 ~/.bashrc 中添加：

sudo vim ~/.bashrc

激活路径：

export PATH="/opt/anaconda/bin:$PATH"

激活默认环境：

source /opt/anaconda/bin/activate base

配置镜像：

conda config --add channels https://mirrors.tuna.tsinghua.edu.cn/anaconda/pkgs/free/
```

zsh配置

```
#安装zsh

sudo pacman -S zsh

#将zsh设置为默认shell
sudo chsh -s /bin/zsh  root   ---root
sudo chsh -s /usr/bin/zsh  godyu  ----本地用户

#安装oh-my-zsh
wget https://github.com/robbyrussell/oh-my-zsh/raw/master/tools/install.sh -O - | sh

#查看主题
ls ～/.oh-my-zsh/themes

#修改主题
/root/.zshrc   ---root shell配置
/home/godyu/.zshrc   ---用户 shell配置
ZSH_THEME=“？？？？”  ---ys

#插件
git
zsh-syntax-highlighting
zsh-autosuggestions
web-search
catimg
vscode
extract
autojump

git clone https://github.com/zsh-users/zsh-syntax-highlighting.git ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-syntax-highlighting

git clone git://github.com/zsh-users/zsh-autosuggestions $ZSH_CUSTOM/plugins/zsh-autosuggestions

首先下载 autojump 源码
git clone git://github.com/joelthelion/autojump.git

然后可安装或卸载
cd autojump 执行
./install.py or ./uninstall.py

由于Linux 下 Shell 启动会自动读取 ~/.zshrc 文件，所以将下面一行添加到该文件中
[[ -s /root/.autojump/etc/profile.d/autojump.sh ]] && source /root/.autojump/etc/profile.d/autojump.sh

```

