{
  "filepath": "/tmp/Csv-3b/src/main/java/org/apache/commons/csv/CSVPrinter.java",
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
      "end_line": 414,
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
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Creates a printer that will print values to the given stream following the CSVFormat.\n     * \u003cp/\u003e\n     * Currently, only a pure encapsulation format or a pure escaping format is supported. Hybrid formats\n     * (encapsulation and escaping with a different character) are not supported.\n     *\n     * @param out\n     *            stream to which to print.\n     * @param format\n     *            the CSV format. If null the default format is used ({@link CSVFormat#DEFAULT})\n     * @throws IllegalArgumentException\n     *             thrown if the parameters of the format are inconsistent\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 23)",
        "(line 60,col 9)-(line 60,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.println()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Outputs the record separator.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 48)",
        "(line 75,col 9)-(line 75,col 25)"
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
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Object...)",
      "begin_line": 99,
      "end_line": 104,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printComment(java.lang.String)",
      "begin_line": 134,
      "end_line": 162,
      "comment": "\n     * Prints a comment on a new line among the delimiter separated values. Comments will always begin on a new line\n     * and occupy a least one full line. The character specified to start comments and a space will be inserted at the\n     * beginning of each new line in the comment.\n     * \u003cp/\u003e\n     * If comments are disabled in the current CSV format this method does nothing.\n     *\n     * @param comment\n     *            the comment to output\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 57)",
        "(line 142,col 9)-(line 142,col 23)",
        "(line 143,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 164,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printDelimiter()",
      "begin_line": 176,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEscape(java.lang.CharSequence, int, int)",
      "begin_line": 187,
      "end_line": 223,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 27)",
        "(line 189,col 9)-(line 189,col 25)",
        "(line 190,col 9)-(line 190,col 37)",
        "(line 192,col 9)-(line 192,col 25)",
        "(line 194,col 9)-(line 194,col 49)",
        "(line 195,col 9)-(line 195,col 59)",
        "(line 197,col 9)-(line 217,col 9)",
        "(line 220,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 228,
      "end_line": 334,
      "comment": "\n     * Note: must only be called if quoting is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 40)",
        "(line 231,col 9)-(line 231,col 30)",
        "(line 232,col 9)-(line 232,col 27)",
        "(line 233,col 9)-(line 233,col 25)",
        "(line 234,col 9)-(line 234,col 37)",
        "(line 236,col 9)-(line 236,col 25)",
        "(line 238,col 9)-(line 238,col 53)",
        "(line 239,col 9)-(line 239,col 65)",
        "(line 241,col 9)-(line 241,col 52)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 310,col 9)",
        "(line 313,col 9)-(line 313,col 30)",
        "(line 317,col 9)-(line 329,col 9)",
        "(line 332,col 9)-(line 332,col 38)",
        "(line 333,col 9)-(line 333,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object)",
      "begin_line": 344,
      "end_line": 348,
      "comment": "\n     * Prints the string as the next value on the line. The value will be escaped or encapsulated as needed.\n     *\n     * @param value\n     *            value to be output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 92)",
        "(line 347,col 9)-(line 347,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Object[])",
      "begin_line": 358,
      "end_line": 368,
      "comment": "\n     * Prints all the objects in the given array.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 378,
      "end_line": 388,
      "comment": "\n     * Prints all the objects in the given collection.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.sql.ResultSet)",
      "begin_line": 399,
      "end_line": 407,
      "comment": "\n     * Prints all the objects in the given JDBC result set.\n     *\n     * @param resultSet result set\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @throws SQLException if a database access error occurs\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 73)",
        "(line 401,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.close()",
      "begin_line": 409,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)"
      ]
    }
  ]
}