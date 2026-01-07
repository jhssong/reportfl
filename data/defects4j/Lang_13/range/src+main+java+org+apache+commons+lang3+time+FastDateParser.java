{
  "filepath": "/tmp/Lang-13b/src/main/java/org/apache/commons/lang3/time/FastDateParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.DateParser",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 809,
      "comment": "\n * \u003cp\u003eFastDateParser is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n * \n * \u003cp\u003eThis class can be used as a direct replacement to\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e in most parsing situations.\n * This class is especially useful in multi-threaded server environments.\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the \n * \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4228335\"\u003ebug\u003c/a\u003e/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly parsing is supported, but all patterns are compatible with\n * SimpleDateFormat.\u003c/p\u003e\n * \n * \u003cp\u003eTiming tests indicate this class is as about as fast as SimpleDateFormat\n * in single thread applications and about 25% faster in multi-thread applications.\u003c/p\u003e\n *\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tzsCache"
      ],
      "begin_line": 68,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " defining fields"
    },
    {
      "type": "field",
      "varNames": [
        "timeZone"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parsePattern"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " derived fields"
    },
    {
      "type": "field",
      "varNames": [
        "strategies"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "thisYear"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameValues"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFormatField"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " dynamic fields to communicate with Strategy"
    },
    {
      "type": "field",
      "varNames": [
        "nextStrategy"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.FastDateParser(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateParser.\u003c/p\u003e\n     * \n     * @param pattern non-null {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone non-null time zone to use\n     * @param locale non-null locale\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 31)",
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 97,col 29)",
        "(line 98,col 9)-(line 98,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.init()",
      "begin_line": 105,
      "end_line": 140,
      "comment": "\n     * Initialize derived fields from defining fields.\n     * This is called from constructor and from readObject (de-serialization)   \n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 76)",
        "(line 108,col 9)-(line 108,col 65)",
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 61)",
        "(line 113,col 9)-(line 113,col 63)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 51)",
        "(line 119,col 9)-(line 119,col 66)",
        "(line 120,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 33)",
        "(line 138,col 9)-(line 138,col 70)",
        "(line 139,col 9)-(line 139,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getPattern()",
      "begin_line": 147,
      "end_line": 149,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getPattern()\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getTimeZone()",
      "begin_line": 154,
      "end_line": 156,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getTimeZone()\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getLocale()",
      "begin_line": 161,
      "end_line": 163,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getLocale()\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.equals(java.lang.Object)",
      "begin_line": 173,
      "end_line": 182,
      "comment": "\n     * \u003cp\u003eCompare another object for equality with this object.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return \u003ccode\u003etrue\u003c/code\u003eif equal to this instance\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 52)",
        "(line 179,col 9)-(line 181,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.hashCode()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eReturn a hashcode compatible with equals.\u003c/p\u003e\n     * \n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.toString()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\n     * \u003cp\u003eGet a string version of this formatter.\u003c/p\u003e\n     * \n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.readObject(java.io.ObjectInputStream)",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the \n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 31)",
        "(line 216,col 9)-(line 216,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parseObject(java.lang.String)",
      "begin_line": 222,
      "end_line": 224,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String)\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parse(java.lang.String)",
      "begin_line": 229,
      "end_line": 235,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String)\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 55)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 240,
      "end_line": 242,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 247,
      "end_line": 263,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 35)",
        "(line 249,col 9)-(line 249,col 72)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 61)",
        "(line 255,col 9)-(line 255,col 20)",
        "(line 257,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 43)",
        "(line 262,col 9)-(line 262,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.escapeRegex(java.lang.StringBuilder, java.lang.String, boolean)",
      "begin_line": 275,
      "end_line": 315,
      "comment": "\n     * Escape constant fields into regular expression\n     * @param regex The destination regex\n     * @param value The source field\n     * @param unquote If true, replace two success quotes (\u0027\u0027) with single quote (\u0027)\n     * @return The \u003ccode\u003eStringBuilder\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 32)",
        "(line 277,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyValue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 320,
      "end_line": 333,
      "comment": "\n     * A class to store Key / Value pairs\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.KeyValue.KeyValue(java.lang.String, int)",
      "begin_line": 329,
      "end_line": 332,
      "comment": "\n         * Construct a Key / Value pair \n         * @param key The key\n         * @param value The value\n         ",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 26)",
        "(line 331,col 13)-(line 331,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "IGNORE_CASE_COMPARATOR"
      ],
      "begin_line": 338,
      "end_line": 342,
      "comment": "\n     * ignore case comparison of keys\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-45a19ac2-bdd8-46a6-9f73-75633a47f6fb.compare(org.apache.commons.lang3.time.FastDateParser.KeyValue, org.apache.commons.lang3.time.FastDateParser.KeyValue)",
      "begin_line": 339,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 13)-(line 340,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getDisplayNames(int)",
      "begin_line": 349,
      "end_line": 375,
      "comment": "\n     * Get the short and long values displayed for a field\n     * @param field The field of interest\n     * @return A sorted array of the field key / value pairs\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 57)",
        "(line 351,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.createKeyValues(java.lang.String[], java.lang.String[])",
      "begin_line": 383,
      "end_line": 388,
      "comment": "\n     * Create key / value pairs from keys \n     * @param longValues The allowable long names for a field\n     * @param shortValues The optional allowable short names for a field\n     * @return The sorted name / value pairs for the field\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 86)",
        "(line 385,col 9)-(line 385,col 79)",
        "(line 386,col 9)-(line 386,col 60)",
        "(line 387,col 9)-(line 387,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.count(java.lang.String[])",
      "begin_line": 395,
      "end_line": 405,
      "comment": "\n     * Get a count of valid values in array.  A valid value is of non-zero length. \n     * @param values The values to check.  This parameter may be null\n     * @return The number of valid values\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 21)",
        "(line 397,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.copy(org.apache.commons.lang3.time.FastDateParser.KeyValue[], int, java.lang.String[])",
      "begin_line": 414,
      "end_line": 424,
      "comment": "\n     * Create key / value pairs from values \n     * @param fieldKeyValues The destination array\n     * @param offset The offset into the destination array \n     * @param values The values to use to create key / value pairs.  This parameter may be null.\n     * @return The offset into the destination array\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.adjustYear(int)",
      "begin_line": 431,
      "end_line": 437,
      "comment": "\n     * Adjust dates to be within 80 years before and 20 years after instantiation\n     * @param twoDigitYear The year to adjust\n     * @return A value within -80 and +20 years from instantiation of this instance\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 58)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.isNextNumber()",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n     * Is the next field a number?\n     * @return true, if next field will be a number \n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getFieldWidth()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * What is the width of the current field?\n     * @return The number of characters in the current format field\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Strategy",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 458,
      "end_line": 480,
      "comment": "\n     * A strategy to parse a single field from the parsing pattern\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.isNumber()",
      "begin_line": 463,
      "end_line": 463,
      "comment": "\n         * Is this field a number?\n         * @return true, if field is a number\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 470,
      "end_line": 470,
      "comment": "\n         * Set the Calendar with the parsed field\n         * @param parser The parser calling this strategy\n         * @param cal The \u003ccode\u003eCalendar\u003c/code\u003e to set\n         * @param value The parsed field to translate and set in cal\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 479,
      "end_line": 479,
      "comment": "\n         * Generate a \u003ccode\u003ePattern\u003c/code\u003e regular expression to the \u003ccode\u003eStringBuilder\u003c/code\u003e \n         * which will accept this field\n         * @param parser The parser calling this strategy\n         * @param regex The \u003ccode\u003eStringBuilder\u003c/code\u003e to append to\n         * @return true, if this field will set the calendar; \n         * false, if this field is a constant value  \n         ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "formatPattern"
      ],
      "begin_line": 485,
      "end_line": 486,
      "comment": "\n     * A \u003ccode\u003ePattern\u003c/code\u003e to parse the user supplied SimpleDateFormat pattern\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getStrategy(java.lang.String)",
      "begin_line": 493,
      "end_line": 549,
      "comment": "\n     * Obtain a Strategy given a field from a SimpleDateFormat pattern\n     * @param formatField A sub-sequence of the SimpleDateFormat pattern\n     * @return The Strategy that will handle parsing for the field\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 51)",
        "(line 541,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CopyQuotedStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 554,
      "end_line": 589,
      "comment": "\n     * A strategy that copies the static or quoted field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "formatField"
      ],
      "begin_line": 555,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.CopyQuotedStrategy(java.lang.String)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n         * Construct a Strategy that ensures the formatField has literal text\n         * @param formatField The literal text to match\n         ",
      "child_ranges": [
        "(line 562,col 13)-(line 562,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.isNumber()",
      "begin_line": 568,
      "end_line": 574,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 569,col 13)-(line 569,col 42)",
        "(line 570,col 13)-(line 572,col 13)",
        "(line 573,col 13)-(line 573,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 579,
      "end_line": 582,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 580,col 13)-(line 580,col 50)",
        "(line 581,col 13)-(line 581,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 587,
      "end_line": 588,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "TextStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 594,
      "end_line": 641,
      "comment": "\n     * A strategy that handles a text field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 595,
      "end_line": 595,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.TextStrategy(int)",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n         * Construct a Strategy that parses a Text field\n         * @param field The Calendar field\n         ",
      "child_ranges": [
        "(line 602,col 13)-(line 602,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.isNumber()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 609,col 13)-(line 609,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 615,
      "end_line": 622,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 616,col 13)-(line 616,col 30)",
        "(line 617,col 13)-(line 619,col 13)",
        "(line 620,col 13)-(line 620,col 51)",
        "(line 621,col 13)-(line 621,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 627,
      "end_line": 640,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 628,col 13)-(line 628,col 68)",
        "(line 629,col 13)-(line 629,col 105)",
        "(line 630,col 13)-(line 638,col 13)",
        "(line 639,col 13)-(line 639,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NumberStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 646,
      "end_line": 692,
      "comment": "\n     * A strategy that handles a number field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 647,
      "end_line": 647,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.NumberStrategy(int)",
      "begin_line": 653,
      "end_line": 655,
      "comment": "\n         * Construct a Strategy that parses a Number field\n         * @param field The Calendar field\n         ",
      "child_ranges": [
        "(line 654,col 14)-(line 654,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.isNumber()",
      "begin_line": 660,
      "end_line": 662,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 661,col 13)-(line 661,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 667,
      "end_line": 675,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 668,col 13)-(line 673,col 13)",
        "(line 674,col 13)-(line 674,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 680,
      "end_line": 682,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 681,col 13)-(line 681,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.modify(int)",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n         * Make any modifications to parsed integer \n         * @param iValue The parsed integer\n         * @return The modified value\n         ",
      "child_ranges": [
        "(line 690,col 13)-(line 690,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ABBREVIATED_YEAR_STRATEGY"
      ],
      "begin_line": 694,
      "end_line": 706,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-501d44aa-35e1-45c2-adf6-bb0c2de61444.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 698,
      "end_line": 705,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 700,col 13)-(line 700,col 48)",
        "(line 701,col 13)-(line 703,col 13)",
        "(line 704,col 13)-(line 704,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 711,
      "end_line": 776,
      "comment": "\n     * A strategy that handles a timezone field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "validTimeZoneChars"
      ],
      "begin_line": 713,
      "end_line": 713,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tzNames"
      ],
      "begin_line": 714,
      "end_line": 714,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.TimeZoneStrategy(java.util.Locale)",
      "begin_line": 720,
      "end_line": 740,
      "comment": "\n         * Construct a Strategy that parses a TimeZone\n         * @param locale The Locale\n         ",
      "child_ranges": [
        "(line 721,col 13)-(line 732,col 13)",
        "(line 733,col 13)-(line 733,col 50)",
        "(line 734,col 13)-(line 734,col 72)",
        "(line 735,col 13)-(line 737,col 13)",
        "(line 738,col 13)-(line 738,col 45)",
        "(line 739,col 13)-(line 739,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.isNumber()",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 746,col 13)-(line 746,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 752,
      "end_line": 755,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 753,col 13)-(line 753,col 45)",
        "(line 754,col 13)-(line 754,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 760,
      "end_line": 775,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 761,col 13)-(line 761,col 24)",
        "(line 762,col 13)-(line 773,col 13)",
        "(line 774,col 13)-(line 774,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ERA_STRATEGY"
      ],
      "begin_line": 778,
      "end_line": 778,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_WEEK_STRATEGY"
      ],
      "begin_line": 779,
      "end_line": 779,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AM_PM_STRATEGY"
      ],
      "begin_line": 780,
      "end_line": 780,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEXT_MONTH_STRATEGY"
      ],
      "begin_line": 781,
      "end_line": 781,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_MONTH_STRATEGY"
      ],
      "begin_line": 783,
      "end_line": 787,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-b052ac13-e52d-4fe7-97a1-2d1b8507383d.modify(int)",
      "begin_line": 784,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 785,col 13)-(line 785,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LITERAL_YEAR_STRATEGY"
      ],
      "begin_line": 788,
      "end_line": 788,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WEEK_OF_YEAR_STRATEGY"
      ],
      "begin_line": 789,
      "end_line": 789,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WEEK_OF_MONTH_STRATEGY"
      ],
      "begin_line": 790,
      "end_line": 790,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_YEAR_STRATEGY"
      ],
      "begin_line": 791,
      "end_line": 791,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_MONTH_STRATEGY"
      ],
      "begin_line": 792,
      "end_line": 792,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_WEEK_IN_MONTH_STRATEGY"
      ],
      "begin_line": 793,
      "end_line": 793,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HOUR_OF_DAY_STRATEGY"
      ],
      "begin_line": 794,
      "end_line": 794,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODULO_HOUR_OF_DAY_STRATEGY"
      ],
      "begin_line": 795,
      "end_line": 799,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-dcf95c0e-360b-4ce5-b584-5784f77b24dd.modify(int)",
      "begin_line": 796,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 797,col 13)-(line 797,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MODULO_HOUR_STRATEGY"
      ],
      "begin_line": 800,
      "end_line": 804,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-4b5e1d0e-3b36-45ab-b61f-94c3306a36f6.modify(int)",
      "begin_line": 801,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 802,col 13)-(line 802,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HOUR_STRATEGY"
      ],
      "begin_line": 805,
      "end_line": 805,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MINUTE_STRATEGY"
      ],
      "begin_line": 806,
      "end_line": 806,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SECOND_STRATEGY"
      ],
      "begin_line": 807,
      "end_line": 807,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MILLISECOND_STRATEGY"
      ],
      "begin_line": 808,
      "end_line": 808,
      "comment": ""
    }
  ]
}