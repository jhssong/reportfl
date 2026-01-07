{
  "filepath": "/tmp/Csv-15b/src/main/java/org/apache/commons/csv/CSVFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVFormat",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 156,
      "end_line": 1979,
      "comment": "\n * Specifies the format of a CSV file and parses input.\n *\n * \u003ch2\u003eUsing predefined formats\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can use one of the predefined formats:\n * \u003c/p\u003e\n *\n * \u003cul\u003e\n * \u003cli\u003e{@link #DEFAULT}\u003c/li\u003e\n * \u003cli\u003e{@link #EXCEL}\u003c/li\u003e\n * \u003cli\u003e{@link #MYSQL}\u003c/li\u003e\n * \u003cli\u003e{@link #RFC4180}\u003c/li\u003e\n * \u003cli\u003e{@link #TDF}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003e\n * For example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVFormat.EXCEL.parse(reader);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * The {@link CSVParser} provides static methods to parse other input types, for example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVParser parser \u003d CSVParser.parse(file, StandardCharsets.US_ASCII, CSVFormat.EXCEL);\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eDefining formats\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can extend a format by calling the {@code with} methods. For example:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withNullString(\u0026quot;N/A\u0026quot;).withIgnoreSurroundingSpaces(true);\n * \u003c/pre\u003e\n *\n * \u003ch2\u003eDefining column names\u003c/h2\u003e\n *\n * \u003cp\u003e\n * To define the column names you want to use to access records, write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * Calling {@link #withHeader(String...)} let\u0027s you use the given names to address values in a {@link CSVRecord}, and\n * assumes that your CSV source does not contain a first record that also defines column names.\n *\n * If it does, then you are overriding this metadata with your names and you should skip the first record by calling\n * {@link #withSkipHeaderRecord(boolean)} with {@code true}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eParsing\u003c/h2\u003e\n *\n * \u003cp\u003e\n * You can use a format directly to parse a reader. For example, to parse an Excel file with columns header, write:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * Reader in \u003d ...;\n * CSVFormat.EXCEL.withHeader(\u0026quot;Col1\u0026quot;, \u0026quot;Col2\u0026quot;, \u0026quot;Col3\u0026quot;).parse(in);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * For other input types, like resources, files, and URLs, use the static methods on {@link CSVParser}.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eReferencing columns safely\u003c/h2\u003e\n *\n * \u003cp\u003e\n * If your source contains a header record, you can simplify your code and safely reference columns, by using\n * {@link #withHeader(String...)} with no arguments:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * CSVFormat.EXCEL.withHeader();\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This causes the parser to read the first record and use its values as column names.\n *\n * Then, call one of the {@link CSVRecord} get method that takes a String column name argument:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * String value \u003d record.get(\u0026quot;Col1\u0026quot;);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * This makes your code impervious to changes in column order in the CSV file.\n * \u003c/p\u003e\n *\n * \u003ch2\u003eNotes\u003c/h2\u003e\n *\n * \u003cp\u003e\n * This class is immutable.\n * \u003c/p\u003e\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.Predefined.Predefined(org.apache.commons.csv.CSVFormat)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.Predefined.getFormat()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n         * Gets the format.\n         *\n         * @return the format.\n         ",
      "child_ranges": [
        "(line 225,col 13)-(line 225,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 244,
      "end_line": 245,
      "comment": "\n     * Standard comma separated format, as for {@link #RFC4180} but allowing empty lines.\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\"\\r\\n\")\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(true)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#Default\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXCEL"
      ],
      "begin_line": 277,
      "end_line": 279,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "INFORMIX_UNLOAD"
      ],
      "begin_line": 307,
      "end_line": 311,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "INFORMIX_UNLOAD_CSV"
      ],
      "begin_line": 338,
      "end_line": 341,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "MYSQL"
      ],
      "begin_line": 370,
      "end_line": 377,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "POSTGRESQL_CSV"
      ],
      "begin_line": 407,
      "end_line": 414,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "POSTGRESQL_TEXT"
      ],
      "begin_line": 444,
      "end_line": 451,
      "comment": " @formatter:off"
    },
    {
      "type": "field",
      "varNames": [
        "RFC4180"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": "\n     * Comma separated format as defined by \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     *\n     * \u003cp\u003e\n     * Settings are:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithQuote(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithRecordSeparator(\"\\r\\n\")\u003c/li\u003e\n     * \u003cli\u003ewithIgnoreEmptyLines(false)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see Predefined#RFC4180\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 471,
      "end_line": 471,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TDF"
      ],
      "begin_line": 489,
      "end_line": 491,
      "comment": " @formatter:off"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(char)",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(java.lang.Character)",
      "begin_line": 514,
      "end_line": 516,
      "comment": "\n     * Returns true if the given character is a line break character.\n     *\n     * @param c\n     *            the character to check, may be null\n     *\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character (and not null)\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.newFormat(char)",
      "begin_line": 538,
      "end_line": 541,
      "comment": "\n     * Creates a new CSV format with the specified delimiter.\n     *\n     * \u003cp\u003e\n     * Use this method if you want to create a CSVFormat from scratch. All fields but the delimiter will be initialized\n     * with null/false.\n     * \u003c/p\u003e\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @return a new CSV format.\n     * @throws IllegalArgumentException\n     *             if the delimiter is a line break character\n     *\n     * @see #DEFAULT\n     * @see #RFC4180\n     * @see #MYSQL\n     * @see #EXCEL\n     * @see #TDF\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 540,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.valueOf(java.lang.String)",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\n     * Gets one of the predefined formats from {@link CSVFormat.Predefined}.\n     *\n     * @param format\n     *            name\n     * @return one of the predefined formats\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "allowMissingColumnNames"
      ],
      "begin_line": 555,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentMarker"
      ],
      "begin_line": 557,
      "end_line": 557,
      "comment": " null if commenting is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 559,
      "end_line": 559,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escapeCharacter"
      ],
      "begin_line": 561,
      "end_line": 561,
      "comment": " null if escaping is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 563,
      "end_line": 563,
      "comment": " array of header column names"
    },
    {
      "type": "field",
      "varNames": [
        "headerComments"
      ],
      "begin_line": 565,
      "end_line": 565,
      "comment": " array of header comment lines"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 567,
      "end_line": 567,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreHeaderCase"
      ],
      "begin_line": 569,
      "end_line": 569,
      "comment": " should ignore header names case"
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 571,
      "end_line": 571,
      "comment": " Should leading/trailing spaces be ignored around values?"
    },
    {
      "type": "field",
      "varNames": [
        "nullString"
      ],
      "begin_line": 573,
      "end_line": 573,
      "comment": " the string to be used for null values"
    },
    {
      "type": "field",
      "varNames": [
        "quoteCharacter"
      ],
      "begin_line": 575,
      "end_line": 575,
      "comment": " null if quoting is disabled"
    },
    {
      "type": "field",
      "varNames": [
        "quoteMode"
      ],
      "begin_line": 577,
      "end_line": 577,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 579,
      "end_line": 579,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "skipHeaderRecord"
      ],
      "begin_line": 581,
      "end_line": 581,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trailingDelimiter"
      ],
      "begin_line": 583,
      "end_line": 583,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "trim"
      ],
      "begin_line": 585,
      "end_line": 585,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "autoFlush"
      ],
      "begin_line": 587,
      "end_line": 587,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormat(char, java.lang.Character, org.apache.commons.csv.QuoteMode, java.lang.Character, java.lang.Character, boolean, boolean, java.lang.String, java.lang.String, java.lang.Object[], java.lang.String[], boolean, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 628,
      "end_line": 652,
      "comment": "\n     * Creates a customized CSV format.\n     *\n     * @param delimiter\n     *            the char used for value separation, must not be a line break character\n     * @param quoteChar\n     *            the Character used as value encapsulation marker, may be {@code null} to disable\n     * @param quoteMode\n     *            the quote mode\n     * @param commentStart\n     *            the Character used for comment identification, may be {@code null} to disable\n     * @param escape\n     *            the Character used to escape special characters in values, may be {@code null} to disable\n     * @param ignoreSurroundingSpaces\n     *            {@code true} when whitespaces enclosing values should be ignored\n     * @param ignoreEmptyLines\n     *            {@code true} when the parser should skip empty lines\n     * @param recordSeparator\n     *            the line separator to use for output\n     * @param nullString\n     *            the line separator to use for output\n     * @param headerComments\n     *            the comments to be printed by the Printer before the actual CSV data\n     * @param header\n     *            the header\n     * @param skipHeaderRecord\n     *            TODO\n     * @param allowMissingColumnNames\n     *            TODO\n     * @param ignoreHeaderCase\n     *            TODO\n     * @param trim\n     *            TODO\n     * @param trailingDelimiter\n     *            TODO\n     * @param autoFlush\n     * @throws IllegalArgumentException\n     *             if the delimiter is a line break character\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 35)",
        "(line 635,col 9)-(line 635,col 40)",
        "(line 636,col 9)-(line 636,col 35)",
        "(line 637,col 9)-(line 637,col 42)",
        "(line 638,col 9)-(line 638,col 38)",
        "(line 639,col 9)-(line 639,col 63)",
        "(line 640,col 9)-(line 640,col 63)",
        "(line 641,col 9)-(line 641,col 49)",
        "(line 642,col 9)-(line 642,col 47)",
        "(line 643,col 9)-(line 643,col 37)",
        "(line 644,col 9)-(line 644,col 60)",
        "(line 645,col 9)-(line 645,col 61)",
        "(line 646,col 9)-(line 646,col 49)",
        "(line 647,col 9)-(line 647,col 49)",
        "(line 648,col 9)-(line 648,col 51)",
        "(line 649,col 9)-(line 649,col 25)",
        "(line 650,col 9)-(line 650,col 35)",
        "(line 651,col 9)-(line 651,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.equals(java.lang.Object)",
      "begin_line": 654,
      "end_line": 721,
      "comment": "",
      "child_ranges": [
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 666,col 9)-(line 666,col 48)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.format(java.lang.Object...)",
      "begin_line": 730,
      "end_line": 739,
      "comment": "\n     * Formats the specified values.\n     *\n     * @param values\n     *            the values to format\n     * @return the formatted values\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 52)",
        "(line 732,col 9)-(line 738,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getAllowMissingColumnNames()",
      "begin_line": 747,
      "end_line": 749,
      "comment": "\n     * Specifies whether missing column names are allowed when parsing the header line.\n     *\n     * @return {@code true} if missing column names are allowed when parsing the header line, {@code false} to throw an\n     *         {@link IllegalArgumentException}.\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getCommentMarker()",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * Returns the character marking the start of a line comment.\n     *\n     * @return the comment start marker, may be {@code null}\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getDelimiter()",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\n     * Returns the character delimiting the values (typically \u0027;\u0027, \u0027,\u0027 or \u0027\\t\u0027).\n     *\n     * @return the delimiter character\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getEscapeCharacter()",
      "begin_line": 774,
      "end_line": 776,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the escape character, may be {@code null}\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeader()",
      "begin_line": 783,
      "end_line": 785,
      "comment": "\n     * Returns a copy of the header array.\n     *\n     * @return a copy of the header array; {@code null} if disabled, the empty array if to be read from the file\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeaderComments()",
      "begin_line": 792,
      "end_line": 794,
      "comment": "\n     * Returns a copy of the header comment array.\n     *\n     * @return a copy of the header comment array; {@code null} if disabled.\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreEmptyLines()",
      "begin_line": 802,
      "end_line": 804,
      "comment": "\n     * Specifies whether empty lines between records are ignored when parsing input.\n     *\n     * @return {@code true} if empty lines between records are ignored, {@code false} if they are turned into empty\n     *         records.\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreHeaderCase()",
      "begin_line": 812,
      "end_line": 814,
      "comment": "\n     * Specifies whether header names will be accessed ignoring case.\n     *\n     * @return {@code true} if header names cases are ignored, {@code false} if they are case sensitive.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getIgnoreSurroundingSpaces()",
      "begin_line": 821,
      "end_line": 823,
      "comment": "\n     * Specifies whether spaces around values are ignored when parsing input.\n     *\n     * @return {@code true} if spaces around values are ignored, {@code false} if they are treated as part of the value.\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getNullString()",
      "begin_line": 835,
      "end_line": 837,
      "comment": "\n     * Gets the String to convert to and from {@code null}.\n     * \u003cul\u003e\n     * \u003cli\u003e\u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteCharacter()",
      "begin_line": 844,
      "end_line": 846,
      "comment": "\n     * Returns the character used to encapsulate values containing special characters.\n     *\n     * @return the quoteChar character, may be {@code null}\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getQuoteMode()",
      "begin_line": 853,
      "end_line": 855,
      "comment": "\n     * Returns the quote policy output fields.\n     *\n     * @return the quote policy\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getRecordSeparator()",
      "begin_line": 862,
      "end_line": 864,
      "comment": "\n     * Returns the record separator delimiting output records.\n     *\n     * @return the record separator\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getSkipHeaderRecord()",
      "begin_line": 871,
      "end_line": 873,
      "comment": "\n     * Returns whether to skip the header record.\n     *\n     * @return whether to skip the header record.\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getTrailingDelimiter()",
      "begin_line": 881,
      "end_line": 883,
      "comment": "\n     * Returns whether to add a trailing delimiter.\n     *\n     * @return whether to add a trailing delimiter.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getTrim()",
      "begin_line": 890,
      "end_line": 892,
      "comment": "\n     * Returns whether to trim leading and trailing blanks.\n     *\n     * @return whether to trim leading and trailing blanks.\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getAutoFlush()",
      "begin_line": 900,
      "end_line": 902,
      "comment": "\n     * Returns whether to flush on close.\n     *\n     * @return whether to flush on close.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.hashCode()",
      "begin_line": 904,
      "end_line": 922,
      "comment": "",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 29)",
        "(line 907,col 9)-(line 907,col 23)",
        "(line 909,col 9)-(line 909,col 44)",
        "(line 910,col 9)-(line 910,col 83)",
        "(line 911,col 9)-(line 911,col 93)",
        "(line 912,col 9)-(line 912,col 91)",
        "(line 913,col 9)-(line 913,col 95)",
        "(line 914,col 9)-(line 914,col 85)",
        "(line 915,col 9)-(line 915,col 74)",
        "(line 916,col 9)-(line 916,col 67)",
        "(line 917,col 9)-(line 917,col 67)",
        "(line 918,col 9)-(line 918,col 67)",
        "(line 919,col 9)-(line 919,col 95)",
        "(line 920,col 9)-(line 920,col 58)",
        "(line 921,col 9)-(line 921,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isCommentMarkerSet()",
      "begin_line": 931,
      "end_line": 933,
      "comment": "\n     * Specifies whether comments are supported by this format.\n     *\n     * Note that the comment introducer character is only recognized at the start of a line.\n     *\n     * @return {@code true} is comments are supported, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEscapeCharacterSet()",
      "begin_line": 940,
      "end_line": 942,
      "comment": "\n     * Returns whether escape are being processed.\n     *\n     * @return {@code true} if escapes are processed\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isNullStringSet()",
      "begin_line": 949,
      "end_line": 951,
      "comment": "\n     * Returns whether a nullString has been defined.\n     *\n     * @return {@code true} if a nullString is defined\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isQuoteCharacterSet()",
      "begin_line": 958,
      "end_line": 960,
      "comment": "\n     * Returns whether a quoteChar has been defined.\n     *\n     * @return {@code true} if a quoteChar is defined\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.parse(java.io.Reader)",
      "begin_line": 975,
      "end_line": 977,
      "comment": "\n     * Parses the specified content.\n     *\n     * \u003cp\u003e\n     * See also the various static parse methods on {@link CSVParser}.\n     * \u003c/p\u003e\n     *\n     * @param in\n     *            the input stream\n     * @return a parser over a stream of {@link CSVRecord}s.\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 976,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Appendable)",
      "begin_line": 992,
      "end_line": 994,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            the output.\n     * @return a printer to an output.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printer()",
      "begin_line": 1008,
      "end_line": 1010,
      "comment": "\n     * Prints to the {@link System#out}.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @return a printer to {@link System#out}.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.io.File, java.nio.charset.Charset)",
      "begin_line": 1028,
      "end_line": 1032,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            the output.\n     * @param charset\n     *            A charset.\n     * @return a printer to an output.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.nio.file.Path, java.nio.charset.Charset)",
      "begin_line": 1050,
      "end_line": 1052,
      "comment": "\n     * Prints to the specified output.\n     *\n     * \u003cp\u003e\n     * See also {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            the output.\n     * @param charset\n     *            A charset.\n     * @return a printer to an output.\n     * @throws IOException\n     *             thrown if the optional header cannot be printed.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Object, java.lang.Appendable, boolean)",
      "begin_line": 1068,
      "end_line": 1088,
      "comment": "\n     * Prints the {@code value} as the next value on the line to {@code out}. The value will be escaped or encapsulated\n     * as needed. Useful when one wants to avoid creating CSVPrinters.\n     *\n     * @param value\n     *            value to output.\n     * @param out\n     *            where to print the value.\n     * @param newRecord\n     *            if this a new record.\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 34)",
        "(line 1072,col 9)-(line 1085,col 9)",
        "(line 1086,col 9)-(line 1086,col 69)",
        "(line 1087,col 9)-(line 1087,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.print(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)",
      "begin_line": 1090,
      "end_line": 1105,
      "comment": "",
      "child_ranges": [
        "(line 1092,col 9)-(line 1094,col 9)",
        "(line 1095,col 9)-(line 1104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printAndEscape(java.lang.CharSequence, int, int, java.lang.Appendable)",
      "begin_line": 1110,
      "end_line": 1145,
      "comment": "\n     * Note: must only be called if escaping is enabled, otherwise will generate NPE\n     ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 27)",
        "(line 1113,col 9)-(line 1113,col 25)",
        "(line 1114,col 9)-(line 1114,col 37)",
        "(line 1116,col 9)-(line 1116,col 42)",
        "(line 1117,col 9)-(line 1117,col 61)",
        "(line 1119,col 9)-(line 1139,col 9)",
        "(line 1142,col 9)-(line 1144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printAndQuote(java.lang.Object, java.lang.CharSequence, int, int, java.lang.Appendable, boolean)",
      "begin_line": 1151,
      "end_line": 1256,
      "comment": " the original object is needed so can check for Number",
      "child_ranges": [
        "(line 1153,col 9)-(line 1153,col 30)",
        "(line 1154,col 9)-(line 1154,col 27)",
        "(line 1155,col 9)-(line 1155,col 25)",
        "(line 1156,col 9)-(line 1156,col 37)",
        "(line 1158,col 9)-(line 1158,col 46)",
        "(line 1159,col 9)-(line 1159,col 63)",
        "(line 1161,col 9)-(line 1161,col 51)",
        "(line 1162,col 9)-(line 1164,col 9)",
        "(line 1165,col 9)-(line 1226,col 9)",
        "(line 1228,col 9)-(line 1232,col 9)",
        "(line 1235,col 9)-(line 1235,col 30)",
        "(line 1239,col 9)-(line 1251,col 9)",
        "(line 1254,col 9)-(line 1254,col 38)",
        "(line 1255,col 9)-(line 1255,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.println(java.lang.Appendable)",
      "begin_line": 1267,
      "end_line": 1274,
      "comment": "\n     * Outputs the trailing delimiter (if set) followed by the record separator (if set).\n     *\n     * @param out\n     *            where to write\n     * @throws IOException\n     *             If an I/O error occurs\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1268,col 9)-(line 1270,col 9)",
        "(line 1271,col 9)-(line 1273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.printRecord(java.lang.Appendable, java.lang.Object...)",
      "begin_line": 1293,
      "end_line": 1298,
      "comment": "\n     * Prints the given {@code values} to {@code out} as a single record of delimiter separated values followed by the\n     * record separator.\n     *\n     * \u003cp\u003e\n     * The values will be quoted if needed. Quotes and new-line characters will be escaped. This method adds the record\n     * separator to the output after printing the record, so there is no need to call {@link #println(Appendable)}.\n     * \u003c/p\u003e\n     *\n     * @param out\n     *            where to write.\n     * @param values\n     *            values to output.\n     * @throws IOException\n     *             If an I/O error occurs.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 1294,col 9)-(line 1296,col 9)",
        "(line 1297,col 9)-(line 1297,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toString()",
      "begin_line": 1300,
      "end_line": 1343,
      "comment": "",
      "child_ranges": [
        "(line 1302,col 9)-(line 1302,col 53)",
        "(line 1303,col 9)-(line 1303,col 63)",
        "(line 1304,col 9)-(line 1307,col 9)",
        "(line 1308,col 9)-(line 1311,col 9)",
        "(line 1312,col 9)-(line 1315,col 9)",
        "(line 1316,col 9)-(line 1319,col 9)",
        "(line 1320,col 9)-(line 1323,col 9)",
        "(line 1324,col 9)-(line 1326,col 9)",
        "(line 1327,col 9)-(line 1329,col 9)",
        "(line 1330,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1333,col 65)",
        "(line 1334,col 9)-(line 1337,col 9)",
        "(line 1338,col 9)-(line 1341,col 9)",
        "(line 1342,col 9)-(line 1342,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toStringArray(java.lang.Object[])",
      "begin_line": 1345,
      "end_line": 1355,
      "comment": "",
      "child_ranges": [
        "(line 1346,col 9)-(line 1348,col 9)",
        "(line 1349,col 9)-(line 1349,col 59)",
        "(line 1350,col 9)-(line 1353,col 9)",
        "(line 1354,col 9)-(line 1354,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.trim(java.lang.CharSequence)",
      "begin_line": 1357,
      "end_line": 1372,
      "comment": "",
      "child_ranges": [
        "(line 1358,col 9)-(line 1360,col 9)",
        "(line 1361,col 9)-(line 1361,col 48)",
        "(line 1362,col 9)-(line 1362,col 24)",
        "(line 1363,col 9)-(line 1363,col 20)",
        "(line 1365,col 9)-(line 1367,col 9)",
        "(line 1368,col 9)-(line 1370,col 9)",
        "(line 1371,col 9)-(line 1371,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.validate()",
      "begin_line": 1379,
      "end_line": 1423,
      "comment": "\n     * Verifies the consistency of the parameters and throws an IllegalArgumentException if necessary.\n     *\n     * @throws IllegalArgumentException\n     ",
      "child_ranges": [
        "(line 1380,col 9)-(line 1382,col 9)",
        "(line 1384,col 9)-(line 1387,col 9)",
        "(line 1389,col 9)-(line 1392,col 9)",
        "(line 1394,col 9)-(line 1397,col 9)",
        "(line 1399,col 9)-(line 1402,col 9)",
        "(line 1404,col 9)-(line 1407,col 9)",
        "(line 1409,col 9)-(line 1411,col 9)",
        "(line 1414,col 9)-(line 1422,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames()",
      "begin_line": 1432,
      "end_line": 1434,
      "comment": "\n     * Returns a new {@code CSVFormat} with the missing column names behavior of the format set to {@code true}\n     *\n     * @return A new CSVFormat that is equal to this but with the specified missing column names behavior.\n     * @see #withAllowMissingColumnNames(boolean)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1433,col 9)-(line 1433,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withAllowMissingColumnNames(boolean)",
      "begin_line": 1444,
      "end_line": 1448,
      "comment": "\n     * Returns a new {@code CSVFormat} with the missing column names behavior of the format set to the given value.\n     *\n     * @param allowMissingColumnNames\n     *            the missing column names behavior, {@code true} to allow missing column names in the header line,\n     *            {@code false} to cause an {@link IllegalArgumentException} to be thrown.\n     * @return A new CSVFormat that is equal to this but with the specified missing column names behavior.\n     ",
      "child_ranges": [
        "(line 1445,col 9)-(line 1447,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentMarker(char)",
      "begin_line": 1461,
      "end_line": 1463,
      "comment": "\n     * Returns a new {@code CSVFormat} with the comment start marker of the format set to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentMarker\n     *            the comment start marker\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1462,col 9)-(line 1462,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentMarker(java.lang.Character)",
      "begin_line": 1476,
      "end_line": 1483,
      "comment": "\n     * Returns a new {@code CSVFormat} with the comment start marker of the format set to the specified character.\n     *\n     * Note that the comment start character is only recognized at the start of a line.\n     *\n     * @param commentMarker\n     *            the comment start marker, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this one but with the specified character as the comment start marker\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1477,col 9)-(line 1479,col 9)",
        "(line 1480,col 9)-(line 1482,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withDelimiter(char)",
      "begin_line": 1494,
      "end_line": 1501,
      "comment": "\n     * Returns a new {@code CSVFormat} with the delimiter of the format set to the specified character.\n     *\n     * @param delimiter\n     *            the delimiter character\n     * @return A new CSVFormat that is equal to this with the specified character as delimiter\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1495,col 9)-(line 1497,col 9)",
        "(line 1498,col 9)-(line 1500,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(char)",
      "begin_line": 1512,
      "end_line": 1514,
      "comment": "\n     * Returns a new {@code CSVFormat} with the escape character of the format set to the specified character.\n     *\n     * @param escape\n     *            the escape character\n     * @return A new CSVFormat that is equal to his but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1513,col 9)-(line 1513,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(java.lang.Character)",
      "begin_line": 1525,
      "end_line": 1532,
      "comment": "\n     * Returns a new {@code CSVFormat} with the escape character of the format set to the specified character.\n     *\n     * @param escape\n     *            the escape character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as the escape character\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1526,col 9)-(line 1528,col 9)",
        "(line 1529,col 9)-(line 1531,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withFirstRecordAsHeader()",
      "begin_line": 1550,
      "end_line": 1552,
      "comment": "\n     * Returns a new {@code CSVFormat} using the first record as header.\n     *\n     * \u003cp\u003e\n     * Calling this method is equivalent to calling:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aFormat.withHeader().withSkipHeaderRecord();\n     * \u003c/pre\u003e\n     *\n     * @return A new CSVFormat that is equal to this but using the first record as header.\n     * @see #withSkipHeaderRecord(boolean)\n     * @see #withHeader(String...)\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1551,col 9)-(line 1551,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.lang.Class\u003c? extends java.lang.Enum\u003c?\u003e\u003e)",
      "begin_line": 1580,
      "end_line": 1590,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format defined by the enum class.\n     *\n     * \u003cp\u003e\n     * Example:\n     * \u003c/p\u003e\n     * \u003cpre\u003e\n     * public enum Header {\n     *     Name, Email, Phone\n     * }\n     *\n     * CSVFormat format \u003d aformat.withHeader(Header.class);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param headerEnum\n     *            the enum defining the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withHeader(String...)\n     * @see #withSkipHeaderRecord(boolean)\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1581,col 9)-(line 1581,col 31)",
        "(line 1582,col 9)-(line 1588,col 9)",
        "(line 1589,col 9)-(line 1589,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.sql.ResultSet)",
      "begin_line": 1618,
      "end_line": 1620,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format set from the result set metadata. The header can\n     * either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(resultSet);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param resultSet\n     *            the resultSet for the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @throws SQLException\n     *             SQLException if a database access error occurs or this method is called on a closed result set.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1619,col 9)-(line 1619,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.sql.ResultSetMetaData)",
      "begin_line": 1648,
      "end_line": 1658,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format set from the result set metadata. The header can\n     * either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(metaData);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param metaData\n     *            the metaData for the header, {@code null} if disabled, empty if parsed automatically, user specified\n     *            otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @throws SQLException\n     *             SQLException if a database access error occurs or this method is called on a closed result set.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1649,col 9)-(line 1649,col 31)",
        "(line 1650,col 9)-(line 1656,col 9)",
        "(line 1657,col 9)-(line 1657,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.lang.String...)",
      "begin_line": 1683,
      "end_line": 1687,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header of the format set to the given values. The header can either be\n     * parsed automatically from the input file with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader();\n     * \u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeader(\u0026quot;name\u0026quot;, \u0026quot;email\u0026quot;, \u0026quot;phone\u0026quot;);\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * The header is also used by the {@link CSVPrinter}.\n     * \u003c/p\u003e\n     *\n     * @param header\n     *            the header, {@code null} if disabled, empty if parsed automatically, user specified otherwise.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withSkipHeaderRecord(boolean)\n     ",
      "child_ranges": [
        "(line 1684,col 9)-(line 1686,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeaderComments(java.lang.Object...)",
      "begin_line": 1704,
      "end_line": 1708,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header comments of the format set to the given values. The comments will\n     * be printed first, before the headers. This setting is ignored by the parser.\n     *\n     * \u003cpre\u003e\n     * CSVFormat format \u003d aformat.withHeaderComments(\u0026quot;Generated by Apache Commons CSV 1.1.\u0026quot;, new Date());\n     * \u003c/pre\u003e\n     *\n     * @param headerComments\n     *            the headerComments which will be printed by the Printer before the actual CSV data.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified header\n     * @see #withSkipHeaderRecord(boolean)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1705,col 9)-(line 1707,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines()",
      "begin_line": 1717,
      "end_line": 1719,
      "comment": "\n     * Returns a new {@code CSVFormat} with the empty line skipping behavior of the format set to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified empty line skipping behavior.\n     * @since {@link #withIgnoreEmptyLines(boolean)}\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1718,col 9)-(line 1718,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreEmptyLines(boolean)",
      "begin_line": 1729,
      "end_line": 1733,
      "comment": "\n     * Returns a new {@code CSVFormat} with the empty line skipping behavior of the format set to the given value.\n     *\n     * @param ignoreEmptyLines\n     *            the empty line skipping behavior, {@code true} to ignore the empty lines between the records,\n     *            {@code false} to translate empty lines to empty records.\n     * @return A new CSVFormat that is equal to this but with the specified empty line skipping behavior.\n     ",
      "child_ranges": [
        "(line 1730,col 9)-(line 1732,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase()",
      "begin_line": 1742,
      "end_line": 1744,
      "comment": "\n     * Returns a new {@code CSVFormat} with the header ignore case behavior set to {@code true}.\n     *\n     * @return A new CSVFormat that will ignore case header name.\n     * @see #withIgnoreHeaderCase(boolean)\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1743,col 9)-(line 1743,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreHeaderCase(boolean)",
      "begin_line": 1755,
      "end_line": 1759,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether header names should be accessed ignoring case.\n     *\n     * @param ignoreHeaderCase\n     *            the case mapping behavior, {@code true} to access name/values, {@code false} to leave the mapping as\n     *            is.\n     * @return A new CSVFormat that will ignore case header name if specified as {@code true}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1756,col 9)-(line 1758,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces()",
      "begin_line": 1768,
      "end_line": 1770,
      "comment": "\n     * Returns a new {@code CSVFormat} with the trimming behavior of the format set to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified trimming behavior.\n     * @see #withIgnoreSurroundingSpaces(boolean)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1769,col 9)-(line 1769,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withIgnoreSurroundingSpaces(boolean)",
      "begin_line": 1780,
      "end_line": 1784,
      "comment": "\n     * Returns a new {@code CSVFormat} with the trimming behavior of the format set to the given value.\n     *\n     * @param ignoreSurroundingSpaces\n     *            the trimming behavior, {@code true} to remove the surrounding spaces, {@code false} to leave the\n     *            spaces as is.\n     * @return A new CSVFormat that is equal to this but with the specified trimming behavior.\n     ",
      "child_ranges": [
        "(line 1781,col 9)-(line 1783,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withNullString(java.lang.String)",
      "begin_line": 1799,
      "end_line": 1803,
      "comment": "\n     * Returns a new {@code CSVFormat} with conversions to and from null for strings on input and output.\n     * \u003cul\u003e\n     * \u003cli\u003e\u003cstrong\u003eReading:\u003c/strong\u003e Converts strings equal to the given {@code nullString} to {@code null} when reading\n     * records.\u003c/li\u003e\n     * \u003cli\u003e\u003cstrong\u003eWriting:\u003c/strong\u003e Writes {@code null} as the given {@code nullString} when writing records.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param nullString\n     *            the String to convert to and from {@code null}. No substitution occurs if {@code null}\n     *\n     * @return A new CSVFormat that is equal to this but with the specified null conversion string.\n     ",
      "child_ranges": [
        "(line 1800,col 9)-(line 1802,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuote(char)",
      "begin_line": 1814,
      "end_line": 1816,
      "comment": "\n     * Returns a new {@code CSVFormat} with the quoteChar of the format set to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1815,col 9)-(line 1815,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuote(java.lang.Character)",
      "begin_line": 1827,
      "end_line": 1834,
      "comment": "\n     * Returns a new {@code CSVFormat} with the quoteChar of the format set to the specified character.\n     *\n     * @param quoteChar\n     *            the quoteChar character, use {@code null} to disable\n     * @return A new CSVFormat that is equal to this but with the specified character as quoteChar\n     * @throws IllegalArgumentException\n     *             thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 1828,col 9)-(line 1830,col 9)",
        "(line 1831,col 9)-(line 1833,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withQuoteMode(org.apache.commons.csv.QuoteMode)",
      "begin_line": 1844,
      "end_line": 1848,
      "comment": "\n     * Returns a new {@code CSVFormat} with the output quote policy of the format set to the specified value.\n     *\n     * @param quoteModePolicy\n     *            the quote policy to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified quote policy\n     ",
      "child_ranges": [
        "(line 1845,col 9)-(line 1847,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(char)",
      "begin_line": 1863,
      "end_line": 1865,
      "comment": "\n     * Returns a new {@code CSVFormat} with the record separator of the format set to the specified character.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote:\u003c/strong\u003e This setting is only used during printing and does not affect parsing. Parsing currently\n     * only works for inputs with \u0027\\n\u0027, \u0027\\r\u0027 and \"\\r\\n\"\n     * \u003c/p\u003e\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified output record separator\n     ",
      "child_ranges": [
        "(line 1864,col 9)-(line 1864,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withRecordSeparator(java.lang.String)",
      "begin_line": 1882,
      "end_line": 1886,
      "comment": "\n     * Returns a new {@code CSVFormat} with the record separator of the format set to the specified String.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote:\u003c/strong\u003e This setting is only used during printing and does not affect parsing. Parsing currently\n     * only works for inputs with \u0027\\n\u0027, \u0027\\r\u0027 and \"\\r\\n\"\n     * \u003c/p\u003e\n     *\n     * @param recordSeparator\n     *            the record separator to use for output.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified output record separator\n     * @throws IllegalArgumentException\n     *             if recordSeparator is none of CR, LF or CRLF\n     ",
      "child_ranges": [
        "(line 1883,col 9)-(line 1885,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSkipHeaderRecord()",
      "begin_line": 1896,
      "end_line": 1898,
      "comment": "\n     * Returns a new {@code CSVFormat} with skipping the header record set to {@code true}.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified skipHeaderRecord setting.\n     * @see #withSkipHeaderRecord(boolean)\n     * @see #withHeader(String...)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1897,col 9)-(line 1897,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSkipHeaderRecord(boolean)",
      "begin_line": 1909,
      "end_line": 1913,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to skip the header record.\n     *\n     * @param skipHeaderRecord\n     *            whether to skip the header record.\n     *\n     * @return A new CSVFormat that is equal to this but with the the specified skipHeaderRecord setting.\n     * @see #withHeader(String...)\n     ",
      "child_ranges": [
        "(line 1910,col 9)-(line 1912,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrailingDelimiter()",
      "begin_line": 1921,
      "end_line": 1923,
      "comment": "\n     * Returns a new {@code CSVFormat} to add a trailing delimiter.\n     *\n     * @return A new CSVFormat that is equal to this but with the trailing delimiter setting.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1922,col 9)-(line 1922,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrailingDelimiter(boolean)",
      "begin_line": 1934,
      "end_line": 1938,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to add a trailing delimiter.\n     *\n     * @param trailingDelimiter\n     *            whether to add a trailing delimiter.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified trailing delimiter setting.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1935,col 9)-(line 1937,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrim()",
      "begin_line": 1946,
      "end_line": 1948,
      "comment": "\n     * Returns a new {@code CSVFormat} to trim leading and trailing blanks.\n     *\n     * @return A new CSVFormat that is equal to this but with the trim setting on.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1947,col 9)-(line 1947,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withTrim(boolean)",
      "begin_line": 1959,
      "end_line": 1963,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to trim leading and trailing blanks.\n     *\n     * @param trim\n     *            whether to trim leading and trailing blanks.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified trim setting.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1960,col 9)-(line 1962,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withAutoFlush(boolean)",
      "begin_line": 1974,
      "end_line": 1978,
      "comment": "\n     * Returns a new {@code CSVFormat} with whether to flush on close.\n     *\n     * @param autoFlush\n     *            whether to flush on close.\n     *\n     * @return A new CSVFormat that is equal to this but with the specified autoFlush setting.\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 1975,col 9)-(line 1977,col 109)"
      ]
    }
  ]
}