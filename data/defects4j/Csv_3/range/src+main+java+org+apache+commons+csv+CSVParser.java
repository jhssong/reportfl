{
  "filepath": "/tmp/Csv-3b/src/main/java/org/apache/commons/csv/CSVParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParser",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e"
      ],
      "begin_line": 83,
      "end_line": 317,
      "comment": "\n * Parses CSV files according to the specified configuration.\n *\n * Because CSV appears in many different dialects, the parser supports many configuration settings by allowing the\n * specification of a {@link CSVFormat}.\n *\n * \u003cp\u003e\n * To parse a CSV input with tabs as separators, \u0027\"\u0027 (double-quote) as an optional value encapsulator,\n * and comments starting with \u0027#\u0027, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d new StringReader(\u0026quot;a\\tb\\nc\\td\u0026quot;);\n * Iterable\u0026lt;CSVRecord\u0026gt; parser \u003d CSVFormat.newBuilder()\n *     .withCommentStart(\u0027#\u0027)\n *     .withDelimiter(\u0027\\t\u0027)\n *     .withQuoteChar(\u0027\"\u0027).parse(in);\n *  for (CSVRecord csvRecord : parse) {\n *     ...\n *  }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * To parse CSV input in a given format like Excel, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d new StringReader(\"a;b\\nc;d\");\n * Iterable\u0026lt;CSVRecord\u0026gt; parser \u003d CSVFormat.EXCEL.parse(in);\n * for (CSVRecord record : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n * \u003cp\u003e\n * You may also get a List of records:\n * \u003c/p\u003e\n * \u003cpre\u003e\n * Reader in \u003d new StringReader(\"a;b\\nc;d\");\n * CSVParser parser \u003d new CSVParser(in, CSVFormat.EXCEL);\n * List\u0026lt;CSVRecord\u0026gt; list \u003d parser.getRecords();\n * \u003c/pre\u003e\n * \u003cp\u003e\n * Internal parser state is completely covered by the format and the reader-state.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * see \u003ca href\u003d\"package-summary.html\"\u003epackage documentation\u003c/a\u003e for more details\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "lexer"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerMap"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordNumber"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "record"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " A record buffer for getRecord(). Grows as necessary and is reused. "
    },
    {
      "type": "field",
      "varNames": [
        "reusableToken"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * CSV parser using the default {@link CSVFormat}.\n     *\n     * @param input\n     *            a Reader containing \"csv-formatted\" input\n     * @throws IllegalArgumentException\n     *             thrown if the parameters of the format are inconsistent\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader, org.apache.commons.csv.CSVFormat)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * @param input\n     *            a Reader containing CSV-formatted input\n     * @param format\n     *            the CSVFormat used for CSV parsing\n     * @throws IllegalArgumentException\n     *             thrown if the parameters of the format are inconsistent\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 77)",
        "(line 123,col 9)-(line 123,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * @param input\n     *            a String containing \"csv-formatted\" input\n     * @param format\n     *            the CSVFormat used for CSV parsing\n     * @throws IllegalArgumentException\n     *             thrown if the parameters of the format are inconsistent\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getHeaderMap()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Returns a copy of the header map that iterates in column order.\n     * \u003cp\u003e\n     * The map keys are column names.\n     * The map values are 0-based indices.\n     *\n     * @return a copy of the header map that iterates in column order.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getLineNumber()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Returns the current line number in the input stream.\n     * \u003cp/\u003e\n     * ATTENTION: If your CSV input has multi-line values, the returned number does not correspond to the record number.\n     *\n     * @return current line number\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecordNumber()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns the current record number in the input stream.\n     * \u003cp/\u003e\n     * ATTENTION: If your CSV input has multi-line values, the returned number does not correspond to the line number.\n     *\n     * @return current line number\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.nextRecord()",
      "begin_line": 183,
      "end_line": 222,
      "comment": "\n     * Parses the next record from the current point in the stream.\n     *\n     * @return the record as an array of values, or \u003ctt\u003enull\u003c/tt\u003e if the end of the stream has been reached\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 32)",
        "(line 185,col 9)-(line 185,col 23)",
        "(line 186,col 9)-(line 186,col 32)",
        "(line 187,col 9)-(line 214,col 46)",
        "(line 216,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecords()",
      "begin_line": 234,
      "end_line": 241,
      "comment": "\n     * Parses the CSV input according to the given format and returns the content as an array of {@link CSVRecord}\n     * entries.\n     * \u003cp/\u003e\n     * The returned content starts at the current parse-position in the stream.\n     *\n     * @return list of {@link CSVRecord} entries, may be empty\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 67)",
        "(line 236,col 9)-(line 236,col 22)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.initializeHeader(org.apache.commons.csv.CSVFormat)",
      "begin_line": 246,
      "end_line": 270,
      "comment": "\n     * Initializes the name to index mapping if the format defines a header.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 43)",
        "(line 248,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.iterator()",
      "begin_line": 276,
      "end_line": 316,
      "comment": "\n     * Returns an iterator on the records. IOExceptions occurring during the iteration are wrapped in a\n     * RuntimeException.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 315,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-2e890385-5886-4778-887f-17f05bfbde02.getNextRecord()",
      "begin_line": 280,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 281,col 17)-(line 286,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-288745ff-9cba-4db2-a34c-ebeea8c4aedf.hasNext()",
      "begin_line": 289,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 290,col 17)-(line 292,col 17)",
        "(line 294,col 17)-(line 294,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-868f27ed-b3d1-4037-9d1f-f737b1e9f855.next()",
      "begin_line": 297,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 298,col 17)-(line 298,col 41)",
        "(line 299,col 17)-(line 299,col 31)",
        "(line 301,col 17)-(line 307,col 17)",
        "(line 309,col 17)-(line 309,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-239cf06c-446a-4326-9898-57e8ced53039.remove()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 313,col 17)-(line 313,col 58)"
      ]
    }
  ]
}