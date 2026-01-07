{
  "filepath": "/tmp/Csv-9b/src/main/java/org/apache/commons/csv/CSVPrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVPrinter",
      "is_interface": false,
      "parent_types": [
        "java.io.Flushable",
        "java.io.Closeable"
      ],
      "begin_line": 36,
      "end_line": 436,
      "comment": "\n * Prints values in a CSV format.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The place that the values get written. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newRecord"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " True if we just began a new record. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVPrinter.CSVPrinter(java.lang.Appendable, org.apache.commons.csv.CSVFormat)",
      "begin_line": 59,
      "end_line": 66,
      "comment": "\n     * Creates a printer that will print values to the given stream following the CSVFormat.\n     * \u003cp\u003e\n     * Currently, only a pure encapsulation format or a pure escaping format is supported. Hybrid formats\n     * (encapsulation and escaping with a different character) are not supported.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            stream to which to print. Must not be null.\n     * @param format\n     *            the CSV format. Must not be null.\n     * @throws IllegalArgumentException\n     *             thrown if the parameters of the format are inconsistent or if either out or format are null.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 39)",
        "(line 61,col 9)-(line 61,col 45)",
        "(line 63,col 9)-(line 63,col 23)",
        "(line 64,col 9)-(line 64,col 29)",
        "(line 65,col 9)-(line 65,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.close()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.flush()",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * Flushes the underlying stream.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object)",
      "begin_line": 98,
      "end_line": 108,
      "comment": "\n     * Prints the string as the next value on the line. The value will be escaped or encapsulated as needed.\n     *\n     * @param value\n     *            value to be output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 24)",
        "(line 101,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 110,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEscape(java.lang.CharSequence, int, int)",
      "begin_line": 129,
      "end_line": 163,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 27)",
        "(line 131,col 9)-(line 131,col 25)",
        "(line 132,col 9)-(line 132,col 37)",
        "(line 134,col 9)-(line 134,col 49)",
        "(line 135,col 9)-(line 135,col 59)",
        "(line 137,col 9)-(line 157,col 9)",
        "(line 160,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 169,
      "end_line": 276,
      "comment": " the original object is needed so can check for Number",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 30)",
        "(line 172,col 9)-(line 172,col 27)",
        "(line 173,col 9)-(line 173,col 25)",
        "(line 174,col 9)-(line 174,col 37)",
        "(line 176,col 9)-(line 176,col 53)",
        "(line 177,col 9)-(line 177,col 65)",
        "(line 179,col 9)-(line 179,col 52)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 252,col 9)",
        "(line 255,col 9)-(line 255,col 30)",
        "(line 259,col 9)-(line 271,col 9)",
        "(line 274,col 9)-(line 274,col 38)",
        "(line 275,col 9)-(line 275,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printComment(java.lang.String)",
      "begin_line": 293,
      "end_line": 321,
      "comment": "\n     * Prints a comment on a new line among the delimiter separated values.\n     *\n     * \u003cp\u003e\n     * Comments will always begin on a new line and occupy a least one full line. The character specified to start\n     * comments and a space will be inserted at the beginning of each new line in the comment.\n     * \u003c/p\u003e\n     *\n     * If comments are disabled in the current CSV format this method does nothing.\n     *\n     * @param comment\n     *            the comment to output\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 57)",
        "(line 301,col 9)-(line 301,col 23)",
        "(line 302,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.println()",
      "begin_line": 329,
      "end_line": 335,
      "comment": "\n     * Outputs the record separator.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 67)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 346,
      "end_line": 351,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Object...)",
      "begin_line": 362,
      "end_line": 367,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 377,
      "end_line": 387,
      "comment": "\n     * Prints all the objects in the given collection.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Object[])",
      "begin_line": 397,
      "end_line": 407,
      "comment": "\n     * Prints all the objects in the given array.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.sql.ResultSet)",
      "begin_line": 418,
      "end_line": 426,
      "comment": "\n     * Prints all the objects in the given JDBC result set.\n     *\n     * @param resultSet result set\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @throws SQLException if a database access error occurs\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 73)",
        "(line 420,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.getOut()",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\n     * Gets the target Appendable.\n     *\n     * @return the target Appendable.\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 24)"
      ]
    }
  ]
}