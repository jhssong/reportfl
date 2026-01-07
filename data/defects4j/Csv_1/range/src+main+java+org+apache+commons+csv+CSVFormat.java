{
  "filepath": "/tmp/Csv-1b/src/main/java/org/apache/commons/csv/CSVFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVFormat",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 442,
      "comment": "\n * The format specification of a CSV file.\n *\n * This class is immutable.\n "
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " According to RFC 4180, line breaks are delimited by CRLF "
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encapsulator"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentStart"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "surroundingSpacesIgnored"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Should leading/trailing spaces be ignored around values?"
    },
    {
      "type": "field",
      "varNames": [
        "emptyLinesIgnored"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineSeparator"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " for outputs"
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DISABLED"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Constant char to be used for disabling comments, escapes and encapsulation.\n     * The value -2 is used because it won\u0027t be confused with an EOF signal (-1),\n     * and because the unicode value FFFE would be encoded as two chars (using surrogates)\n     * and thus there should never be a collision with a real text char.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PRISTINE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Starting format with no settings defined; used for creating other formats from scratch.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 67,
      "end_line": 72,
      "comment": " \n     * Standard comma separated format, as for {@link #RFC4180} but allowing blank lines. \n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithEncapsulator(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithEmptyLinesIgnored(true)\u003c/li\u003e\n     * \u003cli\u003ewithLineSeparator(CRLF)\u003c/li\u003e\n     * \u003c/ul\u003e \n     "
    },
    {
      "type": "field",
      "varNames": [
        "RFC4180"
      ],
      "begin_line": 83,
      "end_line": 87,
      "comment": "\n     * Comma separated format as defined by \u003ca href\u003d\"http://tools.ietf.org/html/rfc4180\"\u003eRFC 4180\u003c/a\u003e.\n     * \u003cul\u003e\n     * \u003cli\u003ewithDelimiter(\u0027,\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithEncapsulator(\u0027\"\u0027)\u003c/li\u003e\n     * \u003cli\u003ewithLineSeparator(CRLF)\u003c/li\u003e\n     * \u003cli\u003e\u003c/li\u003e\n     * \u003c/ul\u003e \n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXCEL"
      ],
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * Excel file format (using a comma as the value delimiter).\n     * Note that the actual value delimiter used by Excel is locale dependent,\n     * it might be necessary to customize this format to accomodate to your\n     * regional settings.\n     * \u003cp/\u003e\n     * For example for parsing or generating a CSV file on a French system\n     * the following format will be used:\n     * \n     * \u003cpre\u003eCSVFormat fmt \u003d CSVFormat.EXCEL.withDelimiter(\u0027;\u0027);\u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TDF"
      ],
      "begin_line": 107,
      "end_line": 113,
      "comment": " Tab-delimited format, with quote; leading and trailing spaces ignored. "
    },
    {
      "type": "field",
      "varNames": [
        "MYSQL"
      ],
      "begin_line": 123,
      "end_line": 127,
      "comment": "\n     * Default MySQL format used by the \u003ctt\u003eSELECT INTO OUTFILE\u003c/tt\u003e and\n     * \u003ctt\u003eLOAD DATA INFILE\u003c/tt\u003e operations. This is a tab-delimited\n     * format with a LF character as the line separator. Values are not quoted\n     * and special characters are escaped with \u0027\\\u0027.\n     * \n     * @see \u003ca href\u003d\"http://dev.mysql.com/doc/refman/5.1/en/load-data.html\"\u003ehttp://dev.mysql.com/doc/refman/5.1/en/load-data.html\u003c/a\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVFormat.CSVFormat(char, char, char, char, boolean, boolean, java.lang.String, java.lang.String[])",
      "begin_line": 142,
      "end_line": 159,
      "comment": "\n     * Creates a customized CSV format.\n     *\n     * @param delimiter                 the char used for value separation\n     * @param encapsulator              the char used as value encapsulation marker\n     * @param commentStart              the char used for comment identification\n     * @param escape                    the char used to escape special characters in values\n     * @param surroundingSpacesIgnored  \u003ctt\u003etrue\u003c/tt\u003e when whitespaces enclosing values should be ignored\n     * @param emptyLinesIgnored         \u003ctt\u003etrue\u003c/tt\u003e when the parser should skip emtpy lines\n     * @param lineSeparator             the line separator to use for output\n     * @param header                    the header\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 35)",
        "(line 152,col 9)-(line 152,col 41)",
        "(line 153,col 9)-(line 153,col 41)",
        "(line 154,col 9)-(line 154,col 29)",
        "(line 155,col 9)-(line 155,col 65)",
        "(line 156,col 9)-(line 156,col 51)",
        "(line 157,col 9)-(line 157,col 43)",
        "(line 158,col 9)-(line 158,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isLineBreak(char)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Returns true if the given character is a line break character.\n     * \n     * @param c the character to check\n     * \n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a line break character\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.validate()",
      "begin_line": 175,
      "end_line": 195,
      "comment": "\n     * Verifies the consistency of the parameters and throws an IllegalArgumentException if necessary.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getDelimiter()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Returns the character delimiting the values (typically \u0027;\u0027, \u0027,\u0027 or \u0027\\t\u0027).\n     * \n     * @return the delimiter character\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withDelimiter(char)",
      "begin_line": 213,
      "end_line": 219,
      "comment": "\n     * Returns a copy of this format using the specified delimiter character.\n     * \n     * @param delimiter the delimiter character\n     * @return A copy of this format using the specified delimiter character\n     * @throws IllegalArgumentException thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 144)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getEncapsulator()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Returns the character used to encapsulate values containing special characters.\n     * \n     * @return the encapsulator character\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEncapsulator(char)",
      "begin_line": 237,
      "end_line": 243,
      "comment": "\n     * Returns a copy of this format using the specified encapsulator character.\n     * \n     * @param encapsulator the encapsulator character\n     * @return A copy of this format using the specified encapsulator character\n     * @throws IllegalArgumentException thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 144)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEncapsulating()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getCommentStart()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Returns the character marking the start of a line comment.\n     * \n     * @return the comment start marker.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withCommentStart(char)",
      "begin_line": 265,
      "end_line": 271,
      "comment": "\n     * Returns a copy of this format using the specified character as the comment start marker.\n     * \n     * @param commentStart the comment start marker\n     * @return A copy of this format using the specified character as the comment start marker\n     * @throws IllegalArgumentException thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 270,col 144)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isCommentingEnabled()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Specifies whether comments are supported by this format.\n     * \n     * @return \u003ctt\u003etrue\u003c/tt\u003e is comments are supported, \u003ctt\u003efalse\u003c/tt\u003e otherwise\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getEscape()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Returns the escape character.\n     * \n     * @return the escape character\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEscape(char)",
      "begin_line": 298,
      "end_line": 304,
      "comment": "\n     * Returns a copy of this format using the specified escape character.\n     * \n     * @param escape the escape character\n     * @return A copy of this format using the specified escape character\n     * @throws IllegalArgumentException thrown if the specified character is a line break\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 303,col 144)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEscaping()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isSurroundingSpacesIgnored()",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * Specifies whether spaces around values are ignored when parsing input.\n     * \n     * @return \u003ctt\u003etrue\u003c/tt\u003e if spaces around values are ignored, \u003ctt\u003efalse\u003c/tt\u003e if they are treated as part of the value.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withSurroundingSpacesIgnored(boolean)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Returns a copy of this format with the specified trimming behavior.\n     *\n     * @param surroundingSpacesIgnored the trimming behavior, \u003ctt\u003etrue\u003c/tt\u003e to remove the surrounding spaces,\n     *                                 \u003ctt\u003efalse\u003c/tt\u003e to leave the spaces as is.\n     * @return A copy of this format with the specified trimming behavior.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 144)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.isEmptyLinesIgnored()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Specifies whether empty lines between records are ignored when parsing input.\n     * \n     * @return \u003ctt\u003etrue\u003c/tt\u003e if empty lines between records are ignored, \u003ctt\u003efalse\u003c/tt\u003e if they are turned into empty records.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withEmptyLinesIgnored(boolean)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * Returns a copy of this format with the specified empty line skipping behavior.\n     *\n     * @param emptyLinesIgnored the empty line skipping behavior, \u003ctt\u003etrue\u003c/tt\u003e to ignore the empty lines\n     *                          between the records, \u003ctt\u003efalse\u003c/tt\u003e to translate empty lines to empty records.\n     * @return A copy of this format  with the specified empty line skipping behavior.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 144)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getLineSeparator()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Returns the line separator delimiting output records.\n     * \n     * @return the line separator\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withLineSeparator(java.lang.String)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * Returns a copy of this format using the specified output line separator.\n     * \n     * @param lineSeparator the line separator to be used for output.\n     * \n     * @return A copy of this format using the specified output line separator\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 144)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.getHeader()",
      "begin_line": 370,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.withHeader(java.lang.String...)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * Returns a copy of this format using the specified header. The header can\n     * either be parsed automatically from the input file with:\n     *\n     * \u003cpre\u003eCSVFormat format \u003d CSVFormat.DEFAULT.withHeader();\u003c/pre\u003e\n     *\n     * or specified manually with:\n     *\n     * \u003cpre\u003eCSVFormat format \u003d CSVFormat.DEFAULT.withHeader(\"name\", \"email\", \"phone\");\u003c/pre\u003e\n     *\n     * @param header the header, \u003ctt\u003enull\u003c/tt\u003e if disabled, empty if parsed automatically, user specified otherwise.\n     *\n     * @return A copy of this format using the specified header\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 144)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.parse(java.io.Reader)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * Parses the specified content.\n     * \n     * @param in the input stream\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.format(java.lang.String...)",
      "begin_line": 406,
      "end_line": 415,
      "comment": "\n     * Format the specified values.\n     * \n     * @param values the values to format\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 46)",
        "(line 408,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVFormat.toString()",
      "begin_line": 417,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 47)",
        "(line 420,col 9)-(line 420,col 63)",
        "(line 421,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 29)"
      ]
    }
  ]
}