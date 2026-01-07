{
  "filepath": "/tmp/Csv-14b/src/main/java/org/apache/commons/csv/CSVPrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVPrinter",
      "is_interface": false,
      "parent_types": [
        "java.io.Flushable",
        "java.io.Closeable"
      ],
      "begin_line": 35,
      "end_line": 341,
      "comment": "\n * Prints values in a CSV format.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The place that the values get written. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newRecord"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " True if we just began a new record. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVPrinter.CSVPrinter(java.lang.Appendable, org.apache.commons.csv.CSVFormat)",
      "begin_line": 60,
      "end_line": 78,
      "comment": "\n     * Creates a printer that will print values to the given stream following the CSVFormat.\n     * \u003cp\u003e\n     * Currently, only a pure encapsulation format or a pure escaping format is supported. Hybrid formats (encapsulation\n     * and escaping with a different character) are not supported.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            stream to which to print. Must not be null.\n     * @param format\n     *            the CSV format. Must not be null.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @throws IllegalArgumentException\n     *             thrown if the parameters of the format are inconsistent or if either out or format are null.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 39)",
        "(line 62,col 9)-(line 62,col 45)",
        "(line 64,col 9)-(line 64,col 23)",
        "(line 65,col 9)-(line 65,col 29)",
        "(line 68,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.close()",
      "begin_line": 84,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.flush()",
      "begin_line": 97,
      "end_line": 102,
      "comment": "\n     * Flushes the underlying stream.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.getOut()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Gets the target Appendable.\n     *\n     * @return the target Appendable.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.print(java.lang.Object)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Prints the string as the next value on the line. The value will be escaped or encapsulated as needed.\n     *\n     * @param value\n     *            value to be output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printComment(java.lang.String)",
      "begin_line": 141,
      "end_line": 169,
      "comment": "\n     * Prints a comment on a new line among the delimiter separated values.\n     *\n     * \u003cp\u003e\n     * Comments will always begin on a new line and occupy a least one full line. The character specified to start\n     * comments and a space will be inserted at the beginning of each new line in the comment.\n     * \u003c/p\u003e\n     *\n     * If comments are disabled in the current CSV format this method does nothing.\n     *\n     * @param comment\n     *            the comment to output\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 58)",
        "(line 149,col 9)-(line 149,col 23)",
        "(line 150,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.println()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Outputs the record separator.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 28)",
        "(line 179,col 9)-(line 179,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 195,
      "end_line": 200,
      "comment": "\n     * Prints the given values a single record of delimiter separated values followed by the record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and newLine characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println()}.\n     * \u003c/p\u003e\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecord(java.lang.Object...)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Prints the given values a single record of delimiter separated values followed by the record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and newLine characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println()}.\n     * \u003c/p\u003e\n     *\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 40)",
        "(line 217,col 9)-(line 217,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 259,
      "end_line": 269,
      "comment": "\n     * Prints all the objects in the given collection handling nested collections/arrays as records.\n     *\n     * \u003cp\u003e\n     * If the given collection only contains simple objects, this method will print a single record like\n     * {@link #printRecord(Iterable)}. If the given collections contains nested collections/arrays those nested elements\n     * will each be printed as records using {@link #printRecord(Object...)}.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Given the following data structure:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * List\u0026lt;String[]\u0026gt; data \u003d ...\n     * data.add(new String[]{ \"A\", \"B\", \"C\" });\n     * data.add(new String[]{ \"1\", \"2\", \"3\" });\n     * data.add(new String[]{ \"A1\", \"B2\", \"C3\" });\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Calling this method will print:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * A, B, C\n     * 1, 2, 3\n     * A1, B2, C3\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.lang.Object...)",
      "begin_line": 310,
      "end_line": 320,
      "comment": "\n     * Prints all the objects in the given array handling nested collections/arrays as records.\n     *\n     * \u003cp\u003e\n     * If the given array only contains simple objects, this method will print a single record like\n     * {@link #printRecord(Object...)}. If the given collections contains nested collections/arrays those nested\n     * elements will each be printed as records using {@link #printRecord(Object...)}.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Given the following data structure:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * String[][] data \u003d new String[3][]\n     * data[0] \u003d String[]{ \"A\", \"B\", \"C\" };\n     * data[1] \u003d new String[]{ \"1\", \"2\", \"3\" };\n     * data[2] \u003d new String[]{ \"A1\", \"B2\", \"C3\" };\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     * Calling this method will print:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * A, B, C\n     * 1, 2, 3\n     * A1, B2, C3\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param values\n     *            the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinter.printRecords(java.sql.ResultSet)",
      "begin_line": 332,
      "end_line": 340,
      "comment": "\n     * Prints all the objects in the given JDBC result set.\n     *\n     * @param resultSet\n     *            result set the values to print.\n     * @throws IOException\n     *             If an I/O error occurs\n     * @throws SQLException\n     *             if a database access error occurs\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 73)",
        "(line 334,col 9)-(line 339,col 9)"
      ]
    }
  ]
}