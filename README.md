### Befehl zum kompilieren mit bib

pdflatex -output-directory=out main.kotlin.com.spruhs.main.tex
biber --output-directory out main.kotlin.com.spruhs.main
pdflatex -output-directory=out main.kotlin.com.spruhs.main.tex
pdflatex -output-directory=out main.kotlin.com.spruhs.main.tex
