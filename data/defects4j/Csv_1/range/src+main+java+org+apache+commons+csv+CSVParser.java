{
  "filepath": "/tmp/Csv-1b/src/main/java/org/apache/commons/csv/CSVParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParser",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e"
      ],
      "begin_line": 63,
      "end_line": 251,
      "comment": "\n * Parses CSV files according to the specified configuration.\n *\n * Because CSV appears in many different dialects, the parser supports many\n * configuration settings by allowing the specification of a {@link CSVFormat}.\n *\n * \u003cp\u003eParsing of a csv-string having tabs as separators,\n * \u0027\"\u0027 as an optional value encapsulator, and comments starting with \u0027#\u0027:\u003c/p\u003e\n * \u003cpre\u003e\n * CSVFormat format \u003d new CSVFormat(\u0027\\t\u0027, \u0027\"\u0027, \u0027#\u0027);\n * Reader in \u003d new StringReader(\"a\\tb\\nc\\td\");\n * List\u0026lt;CSVRecord\u003e records \u003d new CSVParser(in, format).getRecords();\n * \u003c/pre\u003e\n *\n * \u003cp\u003eParsing of a csv-string in Excel CSV format, using a for-each loop:\u003c/p\u003e\n * \u003cpre\u003e\n * Reader in \u003d new StringReader(\"a;b\\nc;d\");\n * CSVParser parser \u003d new CSVParser(in, CSVFormat.EXCEL);\n * for (CSVRecord record : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * Internal parser state is completely covered by the format\n * and the reader-state.\u003c/p\u003e\n *\n * \u003cp\u003esee \u003ca href\u003d\"package-summary.html\"\u003epackage documentation\u003c/a\u003e\n * for more details\u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "lexer"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerMapping"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "record"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " A record buffer for getRecord(). Grows as necessary and is reused. "
    },
    {
      "type": "field",
      "varNames": [
        "reusableToken"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * CSV parser using the default {@link CSVFormat}.\n     *\n     * @param input a Reader containing \"csv-formatted\" input\n     * @throws IllegalArgumentException thrown if the parameters of the format are inconsistent\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader, org.apache.commons.csv.CSVFormat)",
      "begin_line": 91,
      "end_line": 97,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * @param input    a Reader containing \"csv-formatted\" input\n     * @param format the CSVFormat used for CSV parsing\n     * @throws IllegalArgumentException thrown if the parameters of the format are inconsistent\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 26)",
        "(line 94,col 9)-(line 94,col 77)",
        "(line 96,col 9)-(line 96,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * @param input    a String containing \"csv-formatted\" input\n     * @param format the CSVFormat used for CSV parsing\n     * @throws IllegalArgumentException thrown if the parameters of the format are inconsistent\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecords()",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\n     * Parses the CSV input according to the given format and returns the content\n     * as an array of {@link CSVRecord} entries.\n     * \u003cp/\u003e\n     * The returned content starts at the current parse-position in the stream.\n     *\n     * @return list of {@link CSVRecord} entries, may be empty\n     * @throws IOException on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 61)",
        "(line 122,col 9)-(line 122,col 22)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecord()",
      "begin_line": 135,
      "end_line": 164,
      "comment": "\n     * Parses the next record from the current point in the stream.\n     *\n     * @return the record as an array of values, or \u003ctt\u003enull\u003c/tt\u003e if the end of the stream has been reached\n     * @throws IOException on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 62)",
        "(line 137,col 9)-(line 137,col 23)",
        "(line 138,col 9)-(line 158,col 46)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.initializeHeader(org.apache.commons.csv.CSVFormat)",
      "begin_line": 169,
      "end_line": 193,
      "comment": "\n     * Initializes the name to index mapping if the format defines a header.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 43)",
        "(line 171,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.iterator()",
      "begin_line": 199,
      "end_line": 238,
      "comment": "\n     * Returns an iterator on the records. IOExceptions occuring\n     * during the iteration are wrapped in a RuntimeException.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 237,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-170f6ecc-16d2-42d2-8784-97d58cb4bf78.hasNext()",
      "begin_line": 203,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 204,col 17)-(line 206,col 17)",
        "(line 208,col 17)-(line 208,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-5d9a8995-c325-4e48-8eae-520fb6cb012a.next()",
      "begin_line": 211,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 212,col 17)-(line 212,col 41)",
        "(line 213,col 17)-(line 213,col 31)",
        "(line 215,col 17)-(line 221,col 17)",
        "(line 223,col 17)-(line 223,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-ea93a5a2-3fc3-4690-8384-b9eea9cde476.getNextRecord()",
      "begin_line": 226,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 227,col 17)-(line 231,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-2fb55fd9-20c4-456a-b424-c218a6d494b1.remove()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 17)-(line 235,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getLineNumber()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Returns the current line number in the input stream.\n     * \u003cp/\u003e\n     * ATTENTION: in case your csv has multiline-values the returned\n     * number does not correspond to the record-number\n     *\n     * @return current line number\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 37)"
      ]
    }
  ]
}