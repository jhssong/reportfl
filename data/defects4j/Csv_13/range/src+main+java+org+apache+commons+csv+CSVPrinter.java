{
  "filepath": "/tmp/Csv-13b/src/main/java/org/apache/commons/csv/CSVPrinter.java",
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
      "end_line": 520,
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
      "end_line": 79,
      "comment": "\n     * Creates a printer that will print values to the given stream following the CSVFormat.\n     * \u003cp\u003e\n     * Currently, only a pure encapsulation format or a pure escaping format is supported. Hybrid formats (encapsulation\n     * and escaping with a different character) are not supported.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            stream to which to print. Must not be null.\n     * @param format\n     *            the CSV format. Must not be null.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @throws IllegalArgumentException\n     *             thrown if the parameters of the format are inconsistent or if either out or format are null.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 39)",
        "(line 63,col 9)-(line 63,col 45)",
        "(line 65,col 9)-(line 65,col 23)",
        "(line 66,col 9)-(line 66,col 29)",
        "(line 69,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.close()",
      "begin_line": 85,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.flush()",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\n     * Flushes the underlying stream.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.getOut()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Gets the target Appendable.\n     *\n     * @return the target Appendable.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object)",
      "begin_line": 122,
      "end_line": 132,
      "comment": "\n     * Prints the string as the next value on the line. The value will be escaped or encapsulated as needed.\n     *\n     * @param value\n     *            value to be output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 24)",
        "(line 125,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 134,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndEscape(java.lang.CharSequence, int, int)",
      "begin_line": 153,
      "end_line": 187,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 27)",
        "(line 155,col 9)-(line 155,col 25)",
        "(line 156,col 9)-(line 156,col 37)",
        "(line 158,col 9)-(line 158,col 49)",
        "(line 159,col 9)-(line 159,col 68)",
        "(line 161,col 9)-(line 181,col 9)",
        "(line 184,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int)",
      "begin_line": 193,
      "end_line": 298,
      "comment": " the original object is needed so can check for Number",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 30)",
        "(line 196,col 9)-(line 196,col 27)",
        "(line 197,col 9)-(line 197,col 25)",
        "(line 198,col 9)-(line 198,col 37)",
        "(line 200,col 9)-(line 200,col 53)",
        "(line 201,col 9)-(line 201,col 70)",
        "(line 203,col 9)-(line 203,col 58)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 274,col 9)",
        "(line 277,col 9)-(line 277,col 30)",
        "(line 281,col 9)-(line 293,col 9)",
        "(line 296,col 9)-(line 296,col 38)",
        "(line 297,col 9)-(line 297,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printComment(java.lang.String)",
      "begin_line": 315,
      "end_line": 343,
      "comment": "\n     * Prints a comment on a new line among the delimiter separated values.\n     *\n     * \u003cp\u003e\n     * Comments will always begin on a new line and occupy a least one full line. The character specified to start\n     * comments and a space will be inserted at the beginning of each new line in the comment.\n     * \u003c/p\u003e\n     *\n     * If comments are disabled in the current CSV format this method does nothing.\n     *\n     * @param comment\n     *            the comment to output\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 58)",
        "(line 323,col 9)-(line 323,col 23)",
        "(line 324,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.println()",
      "begin_line": 351,
      "end_line": 357,
      "comment": "\n     * Outputs the record separator.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 67)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 372,
      "end_line": 377,
      "comment": "\n     * Prints the given values a single record of delimiter separated values followed by the record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and newLine characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println()}.\n     * \u003c/p\u003e\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Object...)",
      "begin_line": 392,
      "end_line": 397,
      "comment": "\n     * Prints the given values a single record of delimiter separated values followed by the record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and newLine characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println()}.\n     * \u003c/p\u003e\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 438,
      "end_line": 448,
      "comment": "\n     * Prints all the objects in the given collection handling nested collections/arrays as records.\n     *\n     * \u003cp\u003e\n     * If the given collection only contains simple objects, this method will print a single record like\n     * {@link #printRecord(Iterable)}. If the given collections contains nested collections/arrays those nested elements\n     * will each be printed as records using {@link #printRecord(Object...)}.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Given the following data structure:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * List\u0026lt;String[]\u0026gt; data \u003d ...\n     * data.add(new String[]{ \"A\", \"B\", \"C\" });\n     * data.add(new String[]{ \"1\", \"2\", \"3\" });\n     * data.add(new String[]{ \"A1\", \"B2\", \"C3\" });\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Calling this method will print:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * A, B, C\n     * 1, 2, 3\n     * A1, B2, C3\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Object...)",
      "begin_line": 489,
      "end_line": 499,
      "comment": "\n     * Prints all the objects in the given array handling nested collections/arrays as records.\n     *\n     * \u003cp\u003e\n     * If the given array only contains simple objects, this method will print a single record like\n     * {@link #printRecord(Object...)}. If the given collections contains nested collections/arrays those nested\n     * elements will each be printed as records using {@link #printRecord(Object...)}.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Given the following data structure:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * String[][] data \u003d new String[3][]\n     * data[0] \u003d String[]{ \"A\", \"B\", \"C\" };\n     * data[1] \u003d new String[]{ \"1\", \"2\", \"3\" };\n     * data[2] \u003d new String[]{ \"A1\", \"B2\", \"C3\" };\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Calling this method will print:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * A, B, C\n     * 1, 2, 3\n     * A1, B2, C3\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 498,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.sql.ResultSet)",
      "begin_line": 511,
      "end_line": 519,
      "comment": "\n     * Prints all the objects in the given JDBC result set.\n     *\n     * @param resultSet\n     *            result set the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @throws SQLException\n     *             if a database access error occurs\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 73)",
        "(line 513,col 9)-(line 518,col 9)"
      ]
    }
  ]
}