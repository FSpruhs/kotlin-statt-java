### Befehl zum kompilieren mit bib

pdflatex -output-directory=out main.tex
biber --output-directory out main
pdflatex -output-directory=out main.tex
pdflatex -output-directory=out main.tex

