{
  "filepath": "/tmp/Csv-2b/src/main/java/org/apache/commons/csv/CSVPrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVPrinter",
      "is_interface": false,
      "parent_types": [
        "java.io.Flushable",
        "java.io.Closeable"
      ],
      "begin_line": 37,
      "end_line": 415,
      "comment": "\n * Prints values in a CSV format.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The place that the values get written. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newLine"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " True if we just began a new line. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVPrinter.CSVPrinter(java.lang.Appendable, org.apache.commons.csv.CSVFormat)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Creates a printer that will print values to the given stream following the CSVFormat.\n     * \u003cp/\u003e\n     * Currently, only a pure encapsulation format or a pure escaping format is supported. Hybrid formats\n     * (encapsulation and escaping with a different character) are not supported.\n     *\n     * @param out\n     *            stream to which to print.\n     * @param format\n     *            the CSV format. If null the default format is used ({@link CSVFormat#DEFAULT})\n     * @throws IllegalArgumentException\n     *             thrown if the parameters of the format are inconsistent\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 23)",
        "(line 61,col 9)-(line 61,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.println()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Outputs the line separator.\n     * \n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 48)",
        "(line 76,col 9)-(line 76,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.flush()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Flushes the underlying stream.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Object...)",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 116,
      "end_line": 121,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printComment(java.lang.String)",
      "begin_line": 135,
      "end_line": 163,
      "comment": "\n     * Prints a comment on a new line among the delimiter separated values. Comments will always begin on a new line\n     * and occupy a least one full line. The character specified to start comments and a space will be inserted at the\n     * beginning of each new line in the comment.\n     * \u003cp/\u003e\n     * If comments are disabled in the current CSV format this method does nothing.\n     *\n     * @param comment\n     *            the comment to output\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 57)",
        "(line 143,col 9)-(line 143,col 23)",
        "(line 144,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 165,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printDelimiter()",
      "begin_line": 177,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEscape(java.lang.CharSequence, int, int)",
      "begin_line": 188,
      "end_line": 224,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 27)",
        "(line 190,col 9)-(line 190,col 25)",
        "(line 191,col 9)-(line 191,col 37)",
        "(line 193,col 9)-(line 193,col 25)",
        "(line 195,col 9)-(line 195,col 49)",
        "(line 196,col 9)-(line 196,col 59)",
        "(line 198,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 229,
      "end_line": 335,
      "comment": "\n     * Note: must only be called if quoting is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 38)",
        "(line 232,col 9)-(line 232,col 30)",
        "(line 233,col 9)-(line 233,col 27)",
        "(line 234,col 9)-(line 234,col 25)",
        "(line 235,col 9)-(line 235,col 37)",
        "(line 237,col 9)-(line 237,col 25)",
        "(line 239,col 9)-(line 239,col 53)",
        "(line 240,col 9)-(line 240,col 65)",
        "(line 242,col 9)-(line 242,col 52)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 311,col 9)",
        "(line 314,col 9)-(line 314,col 30)",
        "(line 318,col 9)-(line 330,col 9)",
        "(line 333,col 9)-(line 333,col 38)",
        "(line 334,col 9)-(line 334,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object)",
      "begin_line": 345,
      "end_line": 349,
      "comment": "\n     * Prints the string as the next value on the line. The value will be escaped or encapsulated as needed.\n     *\n     * @param value\n     *            value to be output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 73)",
        "(line 348,col 9)-(line 348,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Object[])",
      "begin_line": 359,
      "end_line": 369,
      "comment": "\n     * Prints all the objects in the given array.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 379,
      "end_line": 389,
      "comment": "\n     * Prints all the objects in the given collection.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.sql.ResultSet)",
      "begin_line": 400,
      "end_line": 408,
      "comment": "\n     * Prints all the objects in the given JDBC result set.\n     *\n     * @param resultSet result set\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @throws SQLException if a database access error occurs\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 73)",
        "(line 402,col 9)-(line 407,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.close()",
      "begin_line": 410,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)"
      ]
    }
  ]
}