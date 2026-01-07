{
  "filepath": "/tmp/Csv-1b/src/main/java/org/apache/commons/csv/CSVPrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVPrinter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 307,
      "comment": "\n * Print values as a comma separated list.\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " The place that the values get written. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newLine"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " True if we just began a new line. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVPrinter.CSVPrinter(java.lang.Appendable, org.apache.commons.csv.CSVFormat)",
      "begin_line": 45,
      "end_line": 50,
      "comment": "\n     * Create a printer that will print values to the given stream following the CSVFormat.\n     * \u003cp/\u003e\n     * Currently, only a pure encapsulation format or a pure escaping format\n     * is supported. Hybrid formats (encapsulation and escaping with a different character) are not supported.\n     *\n     * @param out    stream to which to print.\n     * @param format the CSV format. If null the default format is used ({@link CSVFormat#DEFAULT})\n     * @throws IllegalArgumentException thrown if the parameters of the format are inconsistent\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 23)",
        "(line 47,col 9)-(line 47,col 66)",
        "(line 49,col 9)-(line 49,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.println()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Output a blank line\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 46)",
        "(line 61,col 9)-(line 61,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.flush()",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * Flush the underlying stream.\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.println(java.lang.String...)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\n     * Print a single line of comma separated values.\n     * The values will be quoted if needed.  Quotes and\n     * newLine characters will be escaped.\n     *\n     * @param values values to be outputted.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printComment(java.lang.String)",
      "begin_line": 100,
      "end_line": 128,
      "comment": "\n     * Put a comment on a new line among the comma separated values. Comments\n     * will always begin on a new line and occupy a least one full line. The\n     * character specified to start comments and a space will be inserted at\n     * the beginning of each new line in the comment.\n     * \u003cp/\u003e\n     * If comments are disabled in the current CSV format this method does nothing.\n     *\n     * @param comment the comment to output\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 45)",
        "(line 108,col 9)-(line 108,col 24)",
        "(line 109,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.CharSequence, int, int)",
      "begin_line": 131,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printSep()",
      "begin_line": 142,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEscape(java.lang.CharSequence, int, int)",
      "begin_line": 150,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 27)",
        "(line 152,col 9)-(line 152,col 25)",
        "(line 153,col 9)-(line 153,col 31)",
        "(line 155,col 9)-(line 155,col 19)",
        "(line 157,col 9)-(line 157,col 43)",
        "(line 158,col 9)-(line 158,col 41)",
        "(line 160,col 9)-(line 180,col 9)",
        "(line 183,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEncapsulate(java.lang.CharSequence, int, int)",
      "begin_line": 188,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 32)",
        "(line 190,col 9)-(line 190,col 30)",
        "(line 191,col 9)-(line 191,col 27)",
        "(line 192,col 9)-(line 192,col 25)",
        "(line 193,col 9)-(line 193,col 31)",
        "(line 195,col 9)-(line 195,col 19)",
        "(line 197,col 9)-(line 197,col 43)",
        "(line 198,col 9)-(line 198,col 53)",
        "(line 200,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 251,col 9)",
        "(line 254,col 9)-(line 254,col 33)",
        "(line 258,col 9)-(line 270,col 9)",
        "(line 273,col 9)-(line 273,col 38)",
        "(line 274,col 9)-(line 274,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.String, boolean)",
      "begin_line": 283,
      "end_line": 296,
      "comment": "\n     * Print the string as the next value on the line. The value\n     * will be escaped or encapsulated as needed if checkForEscape\u003d\u003dtrue\n     *\n     * @param value value to be outputted.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 295,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.String)",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * Print the string as the next value on the line. The value\n     * will be escaped or encapsulated as needed.\n     *\n     * @param value value to be outputted.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 27)"
      ]
    }
  ]
}