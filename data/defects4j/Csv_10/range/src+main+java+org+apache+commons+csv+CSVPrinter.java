{
  "filepath": "/tmp/Csv-10b/src/main/java/org/apache/commons/csv/CSVPrinter.java",
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
      "end_line": 440,
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
      "begin_line": 61,
      "end_line": 70,
      "comment": "\n     * Creates a printer that will print values to the given stream following the CSVFormat.\n     * \u003cp\u003e\n     * Currently, only a pure encapsulation format or a pure escaping format is supported. Hybrid formats (encapsulation\n     * and escaping with a different character) are not supported.\n     * \u003c/p\u003e\n     * \n     * @param out\n     *        stream to which to print. Must not be null.\n     * @param format\n     *        the CSV format. Must not be null.\n     * @throws IOException\n     *         thrown if the optional header cannot be printed.\n     * @throws IllegalArgumentException\n     *         thrown if the parameters of the format are inconsistent or if either out or format are null.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 39)",
        "(line 63,col 9)-(line 63,col 45)",
        "(line 65,col 9)-(line 65,col 23)",
        "(line 66,col 9)-(line 66,col 29)",
        "(line 67,col 9)-(line 67,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.close()",
      "begin_line": 76,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.flush()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n     * Flushes the underlying stream.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object)",
      "begin_line": 102,
      "end_line": 112,
      "comment": "\n     * Prints the string as the next value on the line. The value will be escaped or encapsulated as needed.\n     *\n     * @param value\n     *            value to be output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 24)",
        "(line 105,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 114,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEscape(java.lang.CharSequence, int, int)",
      "begin_line": 133,
      "end_line": 167,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 27)",
        "(line 135,col 9)-(line 135,col 25)",
        "(line 136,col 9)-(line 136,col 37)",
        "(line 138,col 9)-(line 138,col 49)",
        "(line 139,col 9)-(line 139,col 59)",
        "(line 141,col 9)-(line 161,col 9)",
        "(line 164,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 173,
      "end_line": 280,
      "comment": " the original object is needed so can check for Number",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 30)",
        "(line 176,col 9)-(line 176,col 27)",
        "(line 177,col 9)-(line 177,col 25)",
        "(line 178,col 9)-(line 178,col 37)",
        "(line 180,col 9)-(line 180,col 53)",
        "(line 181,col 9)-(line 181,col 65)",
        "(line 183,col 9)-(line 183,col 52)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 256,col 9)",
        "(line 259,col 9)-(line 259,col 30)",
        "(line 263,col 9)-(line 275,col 9)",
        "(line 278,col 9)-(line 278,col 38)",
        "(line 279,col 9)-(line 279,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printComment(java.lang.String)",
      "begin_line": 297,
      "end_line": 325,
      "comment": "\n     * Prints a comment on a new line among the delimiter separated values.\n     *\n     * \u003cp\u003e\n     * Comments will always begin on a new line and occupy a least one full line. The character specified to start\n     * comments and a space will be inserted at the beginning of each new line in the comment.\n     * \u003c/p\u003e\n     *\n     * If comments are disabled in the current CSV format this method does nothing.\n     *\n     * @param comment\n     *            the comment to output\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 57)",
        "(line 305,col 9)-(line 305,col 23)",
        "(line 306,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.println()",
      "begin_line": 333,
      "end_line": 339,
      "comment": "\n     * Outputs the record separator.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 67)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 350,
      "end_line": 355,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Object...)",
      "begin_line": 366,
      "end_line": 371,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 381,
      "end_line": 391,
      "comment": "\n     * Prints all the objects in the given collection.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Object[])",
      "begin_line": 401,
      "end_line": 411,
      "comment": "\n     * Prints all the objects in the given array.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.sql.ResultSet)",
      "begin_line": 422,
      "end_line": 430,
      "comment": "\n     * Prints all the objects in the given JDBC result set.\n     *\n     * @param resultSet result set\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @throws SQLException if a database access error occurs\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 73)",
        "(line 424,col 9)-(line 429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.getOut()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\n     * Gets the target Appendable.\n     *\n     * @return the target Appendable.\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 24)"
      ]
    }
  ]
}