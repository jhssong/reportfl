{
  "filepath": "/tmp/Csv-4b/src/main/java/org/apache/commons/csv/CSVPrinter.java",
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
      "end_line": 418,
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
      "signature": "org.apache.commons.csv.CSVPrinter.println()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Outputs the record separator.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 48)",
        "(line 79,col 9)-(line 79,col 25)"
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
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Object...)",
      "begin_line": 103,
      "end_line": 108,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 119,
      "end_line": 124,
      "comment": "\n     * Prints a single line of delimiter separated values. The values will be quoted if needed. Quotes and newLine\n     * characters will be escaped.\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printComment(java.lang.String)",
      "begin_line": 138,
      "end_line": 166,
      "comment": "\n     * Prints a comment on a new line among the delimiter separated values. Comments will always begin on a new line\n     * and occupy a least one full line. The character specified to start comments and a space will be inserted at the\n     * beginning of each new line in the comment.\n     * \u003cp/\u003e\n     * If comments are disabled in the current CSV format this method does nothing.\n     *\n     * @param comment\n     *            the comment to output\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 57)",
        "(line 146,col 9)-(line 146,col 23)",
        "(line 147,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 168,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEscape(java.lang.CharSequence, int, int)",
      "begin_line": 187,
      "end_line": 221,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 27)",
        "(line 189,col 9)-(line 189,col 25)",
        "(line 190,col 9)-(line 190,col 37)",
        "(line 192,col 9)-(line 192,col 49)",
        "(line 193,col 9)-(line 193,col 59)",
        "(line 195,col 9)-(line 215,col 9)",
        "(line 218,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 227,
      "end_line": 332,
      "comment": " the original object is needed so can check for Number",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 30)",
        "(line 230,col 9)-(line 230,col 27)",
        "(line 231,col 9)-(line 231,col 25)",
        "(line 232,col 9)-(line 232,col 37)",
        "(line 234,col 9)-(line 234,col 53)",
        "(line 235,col 9)-(line 235,col 65)",
        "(line 237,col 9)-(line 237,col 52)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 308,col 9)",
        "(line 311,col 9)-(line 311,col 30)",
        "(line 315,col 9)-(line 327,col 9)",
        "(line 330,col 9)-(line 330,col 38)",
        "(line 331,col 9)-(line 331,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object)",
      "begin_line": 342,
      "end_line": 352,
      "comment": "\n     * Prints the string as the next value on the line. The value will be escaped or encapsulated as needed.\n     *\n     * @param value\n     *            value to be output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 24)",
        "(line 345,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Object[])",
      "begin_line": 362,
      "end_line": 372,
      "comment": "\n     * Prints all the objects in the given array.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 371,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 382,
      "end_line": 392,
      "comment": "\n     * Prints all the objects in the given collection.\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.sql.ResultSet)",
      "begin_line": 403,
      "end_line": 411,
      "comment": "\n     * Prints all the objects in the given JDBC result set.\n     *\n     * @param resultSet result set\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @throws SQLException if a database access error occurs\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 73)",
        "(line 405,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.close()",
      "begin_line": 413,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)"
      ]
    }
  ]
}