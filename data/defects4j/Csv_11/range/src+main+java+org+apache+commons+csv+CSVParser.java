{
  "filepath": "/tmp/Csv-11b/src/main/java/org/apache/commons/csv/CSVParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParser",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e",
        "java.io.Closeable"
      ],
      "begin_line": 134,
      "end_line": 507,
      "comment": "\n * Parses CSV files according to the specified format.\n *\n * Because CSV appears in many different dialects, the parser supports many formats by allowing the\n * specification of a {@link CSVFormat}.\n *\n * The parser works record wise. It is not possible to go back, once a record has been parsed from the input stream.\n *\n * \u003ch2\u003eCreating instances\u003c/h2\u003e\n * \u003cp\u003e\n * There are several static factory methods that can be used to create instances for various types of resources:\n * \u003c/p\u003e\n * \u003cul\u003e\n *     \u003cli\u003e{@link #parse(java.io.File, Charset, CSVFormat)}\u003c/li\u003e\n *     \u003cli\u003e{@link #parse(String, CSVFormat)}\u003c/li\u003e\n *     \u003cli\u003e{@link #parse(java.net.URL, java.nio.charset.Charset, CSVFormat)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Alternatively parsers can also be created by passing a {@link Reader} directly to the sole constructor.\n *\n * For those who like fluent APIs, parsers can be created using {@link CSVFormat#parse(java.io.Reader)} as a shortcut:\n * \u003c/p\u003e\n * \u003cpre\u003e\n * for(CSVRecord record : CSVFormat.EXCEL.parse(in)) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eParsing record wise\u003c/h2\u003e\n * \u003cp\u003e\n * To parse a CSV input from a file, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * File csvData \u003d new File(\u0026quot;/path/to/csv\u0026quot;);\n * CSVParser parser \u003d CSVParser.parse(csvData, CSVFormat.RFC4180);\n * for (CSVRecord csvRecord : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This will read the parse the contents of the file using the\n * \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\" target\u003d\"_blank\"\u003eRFC 4180\u003c/a\u003e format.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * To parse CSV input in a format like Excel, you write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVParser.parse(csvData, CSVFormat.EXCEL);\n * for (CSVRecord csvRecord : parser) {\n *     ...\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * If the predefined formats don\u0027t match the format at hands, custom formats can be defined. More information about\n * customising CSVFormats is available in {@link CSVFormat CSVFormat JavaDoc}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eParsing into memory\u003c/h2\u003e\n * \u003cp\u003e\n * If parsing record wise is not desired, the contents of the input can be read completely into memory.\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d new StringReader(\u0026quot;a;b\\nc;d\u0026quot;);\n * CSVParser parser \u003d new CSVParser(in, CSVFormat.EXCEL);\n * List\u0026lt;CSVRecord\u0026gt; list \u003d parser.getRecords();\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * There are two constraints that have to be kept in mind:\n * \u003c/p\u003e\n *\n * \u003col\u003e\n *     \u003cli\u003eParsing into memory starts at the current position of the parser. If you have already parsed records from\n *     the input, those records will not end up in the in memory representation of your CSV data.\u003c/li\u003e\n *     \u003cli\u003eParsing into memory may consume a lot of system resources depending on the input. For example if you\u0027re\n *     parsing a 150MB file of CSV data the contents will be read completely into memory.\u003c/li\u003e\n * \u003c/ol\u003e\n *\n * \u003ch2\u003eNotes\u003c/h2\u003e\n * \u003cp\u003e\n * Internal parser state is completely covered by the format and the reader-state.\n * \u003c/p\u003e\n *\n * @version $Id$\n *\n * @see \u003ca href\u003d\"package-summary.html\"\u003epackage documentation for more details\u003c/a\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.io.File, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\n     * Creates a parser for the given {@link File}.\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e This method internally creates a FileReader using\n     * {@link FileReader#FileReader(java.io.File)} which in turn relies on the default encoding of the JVM that\n     * is executing the code. If this is insufficient create a URL to the file and use\n     * {@link #parse(URL, Charset, CSVFormat)}\u003c/p\u003e\n     *\n     * @param file\n     *            a CSV file. Must not be null.\n     * @param charset\n     *            A charset\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either file or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 41)",
        "(line 158,col 9)-(line 158,col 45)",
        "(line 160,col 9)-(line 160,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 176,
      "end_line": 181,
      "comment": "\n     * Creates a parser for the given {@link String}.\n     *\n     * @param string\n     *            a CSV string. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either string or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 45)",
        "(line 178,col 9)-(line 178,col 45)",
        "(line 180,col 9)-(line 180,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.parse(java.net.URL, java.nio.charset.Charset, org.apache.commons.csv.CSVFormat)",
      "begin_line": 203,
      "end_line": 209,
      "comment": "\n     * Creates a parser for the given URL.\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code url}, you should call {@link #close()} on the parser, unless\n     * you close the {@code url}.\n     * \u003c/p\u003e\n     *\n     * @param url\n     *            a URL. Must not be null.\n     * @param charset\n     *            the charset for the resource. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @return a new parser\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either url, charset or format are null.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 39)",
        "(line 205,col 9)-(line 205,col 47)",
        "(line 206,col 9)-(line 206,col 45)",
        "(line 208,col 9)-(line 208,col 87)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerMap"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " A mapping of column names to column indices "
    },
    {
      "type": "field",
      "varNames": [
        "lexer"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "record"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " A record buffer for getRecord(). Grows as necessary and is reused. "
    },
    {
      "type": "field",
      "varNames": [
        "recordNumber"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reusableToken"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVParser.CSVParser(java.io.Reader, org.apache.commons.csv.CSVFormat)",
      "begin_line": 244,
      "end_line": 251,
      "comment": "\n     * Customized CSV parser using the given {@link CSVFormat}\n     *\n     * \u003cp\u003e\n     * If you do not read all records from the given {@code reader}, you should call {@link #close()} on the parser,\n     * unless you close the {@code reader}.\n     * \u003c/p\u003e\n     *\n     * @param reader\n     *            a Reader containing CSV-formatted input. Must not be null.\n     * @param format\n     *            the CSVFormat used for CSV parsing. Must not be null.\n     * @throws IllegalArgumentException\n     *             If the parameters of the format are inconsistent or if either reader or format are null.\n     * @throws IOException\n     *             If there is a problem reading the header or skipping the first record\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 45)",
        "(line 246,col 9)-(line 246,col 45)",
        "(line 248,col 9)-(line 248,col 29)",
        "(line 249,col 9)-(line 249,col 75)",
        "(line 250,col 9)-(line 250,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.addRecordValue()",
      "begin_line": 253,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 67)",
        "(line 255,col 9)-(line 255,col 62)",
        "(line 256,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.close()",
      "begin_line": 269,
      "end_line": 273,
      "comment": "\n     * Closes resources.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getCurrentLineNumber()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * Returns the current line number in the input stream.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the record number.\n     * \u003c/p\u003e\n     *\n     * @return current line number\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getHeaderMap()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Returns a copy of the header map that iterates in column order.\n     * \u003cp\u003e\n     * The map keys are column names. The map values are 0-based indices.\n     * \u003c/p\u003e\n     * @return a copy of the header map that iterates in column order.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecordNumber()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Returns the current record number in the input stream.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the line number.\n     * \u003c/p\u003e\n     *\n     * @return current line number\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecords()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Parses the CSV input according to the given format and returns the content as a list of\n     * {@link CSVRecord CSVRecords}.\n     *\n     * \u003cp\u003e\n     * The returned content starts at the current parse-position in the stream.\n     * \u003c/p\u003e\n     *\n     * @return list of {@link CSVRecord CSVRecords}, may be empty\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.getRecords(T)",
      "begin_line": 345,
      "end_line": 351,
      "comment": "\n     * Parses the CSV input according to the given format and adds the content to the collection of {@link CSVRecord\n     * CSVRecords}.\n     *\n     * \u003cp\u003e\n     * The returned content starts at the current parse-position in the stream.\n     * \u003c/p\u003e\n     *\n     * @param records\n     *            The collection to add to.\n     * @param \u003cT\u003e the type of collection used.\n     * @return a collection of {@link CSVRecord CSVRecords}, may be empty\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 22)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.initializeHeader()",
      "begin_line": 359,
      "end_line": 394,
      "comment": "\n     * Initializes the name to index mapping if the format defines a header.\n     *\n     * @return null if the format has no header.\n     * @throws IOException if there is a problem reading the header or skipping the first record\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 43)",
        "(line 361,col 9)-(line 361,col 62)",
        "(line 362,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.isClosed()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.iterator()",
      "begin_line": 408,
      "end_line": 454,
      "comment": "\n     * Returns an iterator on the records.\n     *\n     * \u003cp\u003eIOExceptions occurring during the iteration are wrapped in a\n     * RuntimeException.\n     * If the parser is closed a call to {@code next()} will throw a\n     * NoSuchElementException.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 453,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-2964cdb8-ebfd-43d3-9953-218ffc863173.getNextRecord()",
      "begin_line": 412,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 413,col 17)-(line 418,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-2e3f91c9-ab1a-423f-80a4-db00cbfc635f.hasNext()",
      "begin_line": 421,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 422,col 17)-(line 424,col 17)",
        "(line 425,col 17)-(line 427,col 17)",
        "(line 429,col 17)-(line 429,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-24dfbfc8-4a9a-4b24-bec6-5997faecc4f2.next()",
      "begin_line": 432,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 433,col 17)-(line 435,col 17)",
        "(line 436,col 17)-(line 436,col 46)",
        "(line 437,col 17)-(line 437,col 36)",
        "(line 439,col 17)-(line 445,col 17)",
        "(line 447,col 17)-(line 447,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.Anonymous-cb48ce96-0b7c-4a98-b42d-9d164c89a63b.remove()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 17)-(line 451,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParser.nextRecord()",
      "begin_line": 463,
      "end_line": 505,
      "comment": "\n     * Parses the next record from the current point in the stream.\n     *\n     * @return the record as an array of values, or \u003ctt\u003enull\u003c/tt\u003e if the end of the stream has been reached\n     * @throws IOException\n     *             on parse error or input read-failure\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 32)",
        "(line 465,col 9)-(line 465,col 28)",
        "(line 466,col 9)-(line 466,col 32)",
        "(line 467,col 9)-(line 496,col 51)",
        "(line 498,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 22)"
      ]
    }
  ]
}