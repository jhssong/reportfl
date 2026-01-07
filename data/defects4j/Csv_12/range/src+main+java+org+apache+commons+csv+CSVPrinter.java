{
  "filepath": "/tmp/Csv-12b/src/main/java/org/apache/commons/csv/CSVPrinter.java",
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
      "end_line": 494,
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
      "end_line": 72,
      "comment": "\n     * Creates a printer that will print values to the given stream following the CSVFormat.\n     * \u003cp\u003e\n     * Currently, only a pure encapsulation format or a pure escaping format is supported. Hybrid formats (encapsulation\n     * and escaping with a different character) are not supported.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *        stream to which to print. Must not be null.\n     * @param format\n     *        the CSV format. Must not be null.\n     * @throws IOException\n     *         thrown if the optional header cannot be printed.\n     * @throws IllegalArgumentException\n     *         thrown if the parameters of the format are inconsistent or if either out or format are null.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 39)",
        "(line 63,col 9)-(line 63,col 45)",
        "(line 65,col 9)-(line 65,col 23)",
        "(line 66,col 9)-(line 66,col 29)",
        "(line 69,col 9)-(line 71,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.close()",
      "begin_line": 78,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.flush()",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * Flushes the underlying stream.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object)",
      "begin_line": 104,
      "end_line": 114,
      "comment": "\n     * Prints the string as the next value on the line. The value will be escaped or encapsulated as needed.\n     *\n     * @param value\n     *            value to be output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 24)",
        "(line 107,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 116,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEscape(java.lang.CharSequence, int, int)",
      "begin_line": 135,
      "end_line": 169,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 27)",
        "(line 137,col 9)-(line 137,col 25)",
        "(line 138,col 9)-(line 138,col 37)",
        "(line 140,col 9)-(line 140,col 49)",
        "(line 141,col 9)-(line 141,col 68)",
        "(line 143,col 9)-(line 163,col 9)",
        "(line 166,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 175,
      "end_line": 280,
      "comment": " the original object is needed so can check for Number",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 30)",
        "(line 178,col 9)-(line 178,col 27)",
        "(line 179,col 9)-(line 179,col 25)",
        "(line 180,col 9)-(line 180,col 37)",
        "(line 182,col 9)-(line 182,col 53)",
        "(line 183,col 9)-(line 183,col 70)",
        "(line 185,col 9)-(line 185,col 58)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 250,col 9)",
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
        "(line 304,col 9)-(line 304,col 58)",
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
      "begin_line": 354,
      "end_line": 359,
      "comment": "\n     * Prints the given values a single record of delimiter separated values followed by the record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and newLine characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println()}.\n     * \u003c/p\u003e\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Object...)",
      "begin_line": 374,
      "end_line": 379,
      "comment": "\n     * Prints the given values a single record of delimiter separated values followed by the record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and newLine characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println()}.\n     * \u003c/p\u003e\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 412,
      "end_line": 422,
      "comment": "\n     * Prints all the objects in the given collection handling nested collections/arrays as records.\n     *\n     * \u003cp\u003eIf the given collection only contains simple objects, this method will print a single record like\n     * {@link #printRecord(Iterable)}. If the given collections contains nested collections/arrays those nested elements\n     * will each be printed as records using {@link #printRecord(Object...)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eGiven the following data structure:\u003c/p\u003e\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * List\u0026lt;String[]\u0026gt; data \u003d ...\n     * data.add(new String[]{ \"A\", \"B\", \"C\" });\n     * data.add(new String[]{ \"1\", \"2\", \"3\" });\n     * data.add(new String[]{ \"A1\", \"B2\", \"C3\" });\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eCalling this method will print:\u003c/p\u003e\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * A, B, C\n     * 1, 2, 3\n     * A1, B2, C3\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 421,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Object...)",
      "begin_line": 455,
      "end_line": 465,
      "comment": "\n     * Prints all the objects in the given array handling nested collections/arrays as records.\n     *\n     * \u003cp\u003eIf the given array only contains simple objects, this method will print a single record like\n     * {@link #printRecord(Object...)}. If the given collections contains nested collections/arrays those nested\n     * elements will each be printed as records using {@link #printRecord(Object...)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eGiven the following data structure:\u003c/p\u003e\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * String[][] data \u003d new String[3][]\n     * data[0] \u003d String[]{ \"A\", \"B\", \"C\" };\n     * data[1] \u003d new String[]{ \"1\", \"2\", \"3\" };\n     * data[2] \u003d new String[]{ \"A1\", \"B2\", \"C3\" };\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eCalling this method will print:\u003c/p\u003e\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * A, B, C\n     * 1, 2, 3\n     * A1, B2, C3\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.sql.ResultSet)",
      "begin_line": 476,
      "end_line": 484,
      "comment": "\n     * Prints all the objects in the given JDBC result set.\n     *\n     * @param resultSet result set\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @throws SQLException if a database access error occurs\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 73)",
        "(line 478,col 9)-(line 483,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.getOut()",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\n     * Gets the target Appendable.\n     *\n     * @return the target Appendable.\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 24)"
      ]
    }
  ]
}