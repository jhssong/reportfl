{
  "filepath": "/tmp/Csv-5b/src/main/java/org/apache/commons/csv/CSVPrinter.java",
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
      "end_line": 428,
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
      "end_line": 65,
      "comment": "\n     * Creates a printer that will print values to the given stream following the CSVFormat.\n     * \u003cp/\u003e\n     * Currently, only a pure encapsulation format or a pure escaping format is supported. Hybrid formats\n     * (encapsulation and escaping with a different character) are not supported.\n     *\n     * @param out\n     *            stream to which to print. Must not be null.\n     * @param format\n     *            the CSV format. Must not be null.\n     * @throws IllegalArgumentException\n     *             thrown if the parameters of the format are inconsistent or if either out or format are null.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 39)",
        "(line 60,col 9)-(line 60,col 45)",
        "(line 62,col 9)-(line 62,col 23)",
        "(line 63,col 9)-(line 63,col 29)",
        "(line 64,col 9)-(line 64,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.close()",
      "begin_line": 71,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.flush()",
      "begin_line": 83,
      "end_line": 87,
      "comment": "\n     * Flushes the underlying stream.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object)",
      "begin_line": 97,
      "end_line": 107,
      "comment": "\n     * Prints the string as the next value on the line. The value will be escaped or encapsulated as needed.\n     *\n     * @param value\n     *            value to be output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 24)",
        "(line 100,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 109,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEscape(java.lang.CharSequence, int, int)",
      "begin_line": 128,
      "end_line": 162,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 27)",
        "(line 130,col 9)-(line 130,col 25)",
        "(line 131,col 9)-(line 131,col 37)",
        "(line 133,col 9)-(line 133,col 49)",
        "(line 134,col 9)-(line 134,col 59)",
        "(line 136,col 9)-(line 156,col 9)",
        "(line 159,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 168,
      "end_line": 273,
      "comment": " the original object is needed so can check for Number",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 30)",
        "(line 171,col 9)-(line 171,col 27)",
        "(line 172,col 9)-(line 172,col 25)",
        "(line 173,col 9)-(line 173,col 37)",
        "(line 175,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 176,col 65)",
        "(line 178,col 9)-(line 178,col 52)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 249,col 9)",
        "(line 252,col 9)-(line 252,col 30)",
        "(line 256,col 9)-(line 268,col 9)",
        "(line 271,col 9)-(line 271,col 38)",
        "(line 272,col 9)-(line 272,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printComment(java.lang.String)",
      "begin_line": 287,
      "end_line": 315,
      "comment": "\n     * Prints a comment on a new line among the delimiter separated values. Comments will always begin on a new line\n     * and occupy a least one full line. The character specified to start comments and a space will be inserted at the\n     * beginning of each new line in the comment.\n     * \u003cp/\u003e\n     * If comments are disabled in the current CSV format this method does nothing.\n     *\n     * @param comment\n     *            the comment to output\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 57)",
        "(line 295,col 9)-(line 295,col 23)",
        "(line 296,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.println()",
      "begin_line": 323,
      "end_line": 327,
      "comment": "\n     * Outputs the record separator.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 67)",
        "(line 325,col 13)-(line 325,col 40)",
        "(line 326,col 9)-(line 326,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 338,
      "end_line": 343,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Object...)",
      "begin_line": 354,
      "end_line": 359,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 369,
      "end_line": 379,
      "comment": "\n     * Prints all the objects in the given collection.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 378,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Object[])",
      "begin_line": 389,
      "end_line": 399,
      "comment": "\n     * Prints all the objects in the given array.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.sql.ResultSet)",
      "begin_line": 410,
      "end_line": 418,
      "comment": "\n     * Prints all the objects in the given JDBC result set.\n     *\n     * @param resultSet result set\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @throws SQLException if a database access error occurs\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 73)",
        "(line 412,col 9)-(line 417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.getOut()",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Gets the target Appendable. \n     * \n     * @return the target Appendable. \n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 24)"
      ]
    }
  ]
}