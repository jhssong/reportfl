{
  "filepath": "/tmp/Csv-5b/src/main/java/org/apache/commons/csv/CSVParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParser",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e",
        "java.io.Closeable"
      ],
      "begin_line": 133,
      "end_line": 465,
      "comment": "\n * Parses CSV files according to the specified format.\n *\n * Because CSV appears in many different dialects, the parser supports many formats by allowing the\n * specification of a {@link CSVFormat}.\n *\n * The parser works record wise. It is not possible to go back, once a record has been parsed from the input stream.\n *\n * \u003ch4\u003eCreating instances\u003c/h4\u003e\n * There are several static factory methods that can be used to create instances for various types of resources:\n * \u003cp\u003e\n * \u003cul\u003e\n *     \u003cli\u003e{@link #parse(java.io.File, CSVFormat)}\u003c/li\u003e\n *     \u003cli\u003e{@link #parse(String, CSVFormat)}\u003c/li\u003e\n *     \u003cli\u003e{@link #parse(java.net.URL, java.nio.charset.Charset, CSVFormat)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * Alternatively parsers can also be created by passing a {@link Reader} directly to the sole constructor.\n * \n * For those who like fluent APIs, parsers can be created using {@link CSVFormat#parse(java.io.Reader)} as a shortcut:\n * \u003c/p\u003e\n * \u003cpre\u003e\n * for(CSVRecord record : CSVFormat.EXCEL.parse(in)) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003ch4\u003eParsing record wise\u003c/h4\u003e\n * \u003cp\u003e\n * To parse a CSV input from a file, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * File csvData \u003d new File(\u0026quot;/path/to/csv\u0026quot;);\n * CSVParser parser \u003d CSVParser.parse(csvData, CSVFormat.RFC4180);\n * for (CSVRecord csvRecord : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This will read the parse the contents of the file using the\n * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\" target\u003d\"_blank\"\u003eRFC 4180\u003c/a\u003e format.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * To parse CSV input in a format like Excel, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVParser.parse(csvData, CSVFormat.EXCEL);\n * for (CSVRecord csvRecord : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * If the predefined formats don\u0027t match the format at hands, custom formats can be defined. More information about\n * customising CSVFormats is available in {@link CSVFormat CSVFormat JavaDoc}.\n * \u003c/p\u003e\n *\n * \u003ch4\u003eParsing into memory\u003c/h4\u003e\n * \u003cp\u003e\n * If parsing record wise is not desired, the contents of the input can be read completely into memory.\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d new StringReader(\u0026quot;a;b\\nc;d\u0026quot;);\n * CSVParser parser \u003d new CSVParser(in, CSVFormat.EXCEL);\n * List\u0026lt;CSVRecord\u0026gt; list \u003d parser.getRecords();\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * There are two constraints that have to be kept in mind:\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * \u003col\u003e\n *     \u003cli\u003eParsing into memory starts at the current position of the parser. If you have already parsed records from\n *     the input, those records will not end up in the in memory representation of your CSV data.\u003c/li\u003e\n *     \u003cli\u003eParsing into memory may consume a lot of system resources depending on the input. For example if you\u0027re\n *     parsing a 150MB file of CSV data the contents will be read completely into memory.\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003c/p\u003e\n *\n * \u003ch4\u003eNotes\u003c/h4\u003e\n * \u003cp\u003e\n * Internal parser state is completely covered by the format and the reader-state.\n * \u003c/p\u003e\n *\n * @version $Id$\n *\n * @see \u003ca href\u003d\"package-summary.html\"\u003epackage documentation for more details\u003c/a\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.io.File, org.apache.commons.csv.CSVFormat)",
      "begin_line": 148,
      "end_line": 153,
      "comment": "\n     * Creates a parser for the given {@link File}.\n     *\n     * @param file\n     *            a CSV file. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either file or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 41)",
        "(line 150,col 9)-(line 150,col 45)",
        "(line 152,col 9)-(line 152,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 168,
      "end_line": 173,
      "comment": "\n     * Creates a parser for the given {@link String}.\n     *\n     * @param string\n     *            a CSV string. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either string or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 45)",
        "(line 170,col 9)-(line 170,col 45)",
        "(line 172,col 9)-(line 172,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.net.URL, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 195,
      "end_line": 202,
      "comment": "\n     * Creates a parser for the given URL.\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code url}, you should call {@link #close()} on the parser, unless\n     * you close the {@code url}.\n     * \u003c/p\u003e\n     *\n     * @param url\n     *            a URL. Must not be null.\n     * @param charset\n     *            the charset for the resource. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either url, charset or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 39)",
        "(line 197,col 9)-(line 197,col 47)",
        "(line 198,col 9)-(line 198,col 45)",
        "(line 200,col 9)-(line 201,col 92)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerMap"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " A mapping of column names to column indices "
    },
    {
      "type": "field",
      "varNames": [
        "lexer"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "record"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " A record buffer for getRecord(). Grows as necessary and is reused. "
    },
    {
      "type": "field",
      "varNames": [
        "recordNumber"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reusableToken"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader, org.apache.commons.csv.CSVFormat)",
      "begin_line": 237,
      "end_line": 245,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should call {@link #close()} on the parser,\n     * unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either reader or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 45)",
        "(line 239,col 9)-(line 239,col 45)",
        "(line 241,col 9)-(line 241,col 26)",
        "(line 242,col 9)-(line 242,col 29)",
        "(line 243,col 9)-(line 243,col 75)",
        "(line 244,col 9)-(line 244,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.addRecordValue()",
      "begin_line": 247,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 67)",
        "(line 249,col 9)-(line 249,col 62)",
        "(line 250,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.close()",
      "begin_line": 263,
      "end_line": 267,
      "comment": "\n     * Closes resources.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getCurrentLineNumber()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Returns the current line number in the input stream.\n     * \u003cp/\u003e\n     * ATTENTION: If your CSV input has multi-line values, the returned number does not correspond to the record number.\n     *\n     * @return current line number\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getHeaderMap()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Returns a copy of the header map that iterates in column order.\n     * \u003cp\u003e\n     * The map keys are column names. The map values are 0-based indices.\n     * \u003c/p\u003e\n     * @return a copy of the header map that iterates in column order.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecordNumber()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Returns the current record number in the input stream.\n     * \u003cp/\u003e\n     * ATTENTION: If your CSV input has multi-line values, the returned number does not correspond to the line number.\n     *\n     * @return current line number\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecords()",
      "begin_line": 312,
      "end_line": 319,
      "comment": "\n     * Parses the CSV input according to the given format and returns the content as a list of\n     * {@link CSVRecord CSVRecords}.\n     * \u003cp/\u003e\n     * The returned content starts at the current parse-position in the stream.\n     *\n     * @return list of {@link CSVRecord CSVRecords}, may be empty\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 67)",
        "(line 314,col 9)-(line 314,col 22)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.initializeHeader()",
      "begin_line": 326,
      "end_line": 354,
      "comment": "\n     * Initializes the name to index mapping if the format defines a header.\n     * \n     * @return null if the format has no header.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 43)",
        "(line 328,col 9)-(line 328,col 62)",
        "(line 329,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.isClosed()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.iterator()",
      "begin_line": 368,
      "end_line": 414,
      "comment": "\n     * Returns an iterator on the records.\n     *\n     * \u003cp\u003eIOExceptions occurring during the iteration are wrapped in a\n     * RuntimeException.\n     * If the parser is closed a call to {@code next()} will throw a\n     * NoSuchElementException.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 413,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-5d6c236c-d133-46ef-b769-7299374568ab.getNextRecord()",
      "begin_line": 372,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 373,col 17)-(line 378,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-40e21750-112e-4315-a89b-eacbf38e3ea0.hasNext()",
      "begin_line": 381,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 382,col 17)-(line 384,col 17)",
        "(line 385,col 17)-(line 387,col 17)",
        "(line 389,col 17)-(line 389,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-de4552e6-e776-4267-ada3-8a5ddfe6c032.next()",
      "begin_line": 392,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 393,col 17)-(line 395,col 17)",
        "(line 396,col 17)-(line 396,col 46)",
        "(line 397,col 17)-(line 397,col 36)",
        "(line 399,col 17)-(line 405,col 17)",
        "(line 407,col 17)-(line 407,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-79908265-59b1-45b5-8275-fe278afa4f1e.remove()",
      "begin_line": 410,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 17)-(line 411,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.nextRecord()",
      "begin_line": 423,
      "end_line": 463,
      "comment": "\n     * Parses the next record from the current point in the stream.\n     *\n     * @return the record as an array of values, or \u003ctt\u003enull\u003c/tt\u003e if the end of the stream has been reached\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 32)",
        "(line 425,col 9)-(line 425,col 28)",
        "(line 426,col 9)-(line 426,col 32)",
        "(line 427,col 9)-(line 454,col 51)",
        "(line 456,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 22)"
      ]
    }
  ]
}