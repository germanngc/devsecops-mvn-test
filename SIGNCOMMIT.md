# Sign Commit

```bash
gpg --list-secret-keys --keyid-format=long

git config user.signingkey <theKEY>
git config commit.gpgsign true

export GPG_TTY=$(tty)

git commit -m "Message"
```