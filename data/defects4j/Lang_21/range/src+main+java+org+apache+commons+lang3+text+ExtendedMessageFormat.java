{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedMessageFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.MessageFormat"
      ],
      "begin_line": 71,
      "end_line": 536,
      "comment": "\n * Extends \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e to allow pluggable/additional formatting\n * options for embedded format elements.  Client code should specify a registry\n * of \u003ccode\u003eFormatFactory\u003c/code\u003e instances associated with \u003ccode\u003eString\u003c/code\u003e\n * format names.  This registry will be consulted when the format elements are \n * parsed from the message pattern.  In this way custom patterns can be specified,\n * and the formats supported by \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e can be overridden\n * at the format and/or format style level (see MessageFormat).  A \"format element\"\n * embedded in the message pattern is specified (\u003cb\u003e()?\u003c/b\u003e signifies optionality):\u003cbr /\u003e\n * \u003ccode\u003e{\u003c/code\u003e\u003ci\u003eargument-number\u003c/i\u003e\u003cb\u003e(\u003c/b\u003e\u003ccode\u003e,\u003c/code\u003e\u003ci\u003eformat-name\u003c/i\u003e\u003cb\u003e(\u003c/b\u003e\u003ccode\u003e,\u003c/code\u003e\u003ci\u003eformat-style\u003c/i\u003e\u003cb\u003e)?)?\u003c/b\u003e\u003ccode\u003e}\u003c/code\u003e\n *\n * \u003cp\u003e\n * \u003ci\u003eformat-name\u003c/i\u003e and \u003ci\u003eformat-style\u003c/i\u003e values are trimmed of surrounding whitespace\n * in the manner of \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e.  If \u003ci\u003eformat-name\u003c/i\u003e denotes\n * \u003ccode\u003eFormatFactory formatFactoryInstance\u003c/code\u003e in \u003ccode\u003eregistry\u003c/code\u003e, a \u003ccode\u003eFormat\u003c/code\u003e\n * matching \u003ci\u003eformat-name\u003c/i\u003e and \u003ci\u003eformat-style\u003c/i\u003e is requested from\n * \u003ccode\u003eformatFactoryInstance\u003c/code\u003e.  If this is successful, the \u003ccode\u003eFormat\u003c/code\u003e\n * found is used for this format element.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\u003cb\u003eNOTICE:\u003c/b\u003e The various subformat mutator methods are considered unnecessary; they exist on the parent\n * class to allow the type of customization which it is the job of this class to provide in\n * a configurable fashion.  These methods have thus been disabled and will throw\n * \u003ccode\u003eUnsupportedOperationException\u003c/code\u003e if called.\n * \u003c/p\u003e\n * \n * \u003cp\u003eLimitations inherited from \u003ccode\u003ejava.text.MessageFormat\u003c/code\u003e:\n * \u003cul\u003e\n * \u003cli\u003eWhen using \"choice\" subformats, support for nested formatting instructions is limited\n *     to that provided by the base class.\u003c/li\u003e\n * \u003cli\u003eThread-safety of \u003ccode\u003eFormat\u003c/code\u003es, including \u003ccode\u003eMessageFormat\u003c/code\u003e and thus\n *     \u003ccode\u003eExtendedMessageFormat\u003c/code\u003e, is not guaranteed.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SEED"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUMMY_PATTERN"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPED_QUOTE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FMT"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "END_FE"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "toPattern"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Create a new ExtendedMessageFormat for the default locale.\n     * \n     * @param pattern  the pattern to use, not null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Locale)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern  the pattern to use, not null\n     * @param locale  the locale to use, not null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Map\u003cjava.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory\u003e)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Create a new ExtendedMessageFormat for the default locale.\n     * \n     * @param pattern  the pattern to use, not null\n     * @param registry  the registry of format factories, may be null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.ExtendedMessageFormat(java.lang.String, java.util.Locale, java.util.Map\u003cjava.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory\u003e)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\n     * Create a new ExtendedMessageFormat.\n     * \n     * @param pattern  the pattern to use, not null\n     * @param locale  the locale to use, not null\n     * @param registry  the registry of format factories, may be null\n     * @throws IllegalArgumentException in case of a bad pattern.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 29)",
        "(line 127,col 9)-(line 127,col 26)",
        "(line 128,col 9)-(line 128,col 33)",
        "(line 129,col 9)-(line 129,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.toPattern()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.applyPattern(java.lang.String)",
      "begin_line": 145,
      "end_line": 210,
      "comment": "\n     * Apply the specified pattern.\n     * \n     * @param pattern String\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 65)",
        "(line 153,col 9)-(line 153,col 70)",
        "(line 154,col 9)-(line 154,col 72)",
        "(line 156,col 9)-(line 156,col 49)",
        "(line 157,col 9)-(line 157,col 41)",
        "(line 158,col 9)-(line 158,col 25)",
        "(line 159,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 51)",
        "(line 196,col 9)-(line 196,col 72)",
        "(line 197,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormat(int, java.text.Format)",
      "begin_line": 219,
      "end_line": 222,
      "comment": "\n     * Throws UnsupportedOperationException - see class Javadoc for details.\n     * \n     * @param formatElementIndex format element index\n     * @param newFormat the new format\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatByArgumentIndex(int, java.text.Format)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "\n     * Throws UnsupportedOperationException - see class Javadoc for details.\n     * \n     * @param argumentIndex argument index\n     * @param newFormat the new format\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormats(java.text.Format[])",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * Throws UnsupportedOperationException - see class Javadoc for details.\n     * \n     * @param newFormats new formats\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.setFormatsByArgumentIndex(java.text.Format[])",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * Throws UnsupportedOperationException - see class Javadoc for details.\n     * \n     * @param newFormats new formats\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.equals(java.lang.Object)",
      "begin_line": 264,
      "end_line": 286,
      "comment": "\n     * Check if this extended message format is equal to another object.\n     *\n     * @param obj the object to compare to\n     * @return true if this object equals the other, otherwise false\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 63)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.hashCode()",
      "begin_line": 293,
      "end_line": 299,
      "comment": "\n     * Return the hashcode.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 38)",
        "(line 296,col 9)-(line 296,col 69)",
        "(line 297,col 9)-(line 297,col 70)",
        "(line 298,col 9)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.getFormat(java.lang.String)",
      "begin_line": 307,
      "end_line": 322,
      "comment": "\n     * Get a custom format from a format description.\n     * \n     * @param desc String\n     * @return Format\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(java.lang.String, java.text.ParsePosition)",
      "begin_line": 331,
      "end_line": 364,
      "comment": "\n     * Read the argument index from the current format element\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @return argument index\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 35)",
        "(line 333,col 9)-(line 333,col 32)",
        "(line 334,col 9)-(line 334,col 49)",
        "(line 335,col 9)-(line 335,col 30)",
        "(line 336,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 363,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.parseFormatDescription(java.lang.String, java.text.ParsePosition)",
      "begin_line": 373,
      "end_line": 396,
      "comment": "\n     * Parse the format component of a format element.\n     * \n     * @param pattern string to parse\n     * @param pos current parse position\n     * @return Format description String\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 35)",
        "(line 375,col 9)-(line 375,col 32)",
        "(line 376,col 9)-(line 376,col 34)",
        "(line 377,col 9)-(line 377,col 22)",
        "(line 378,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 395,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.insertFormats(java.lang.String, java.util.ArrayList\u003cjava.lang.String\u003e)",
      "begin_line": 405,
      "end_line": 440,
      "comment": "\n     * Insert formats back into the pattern for toPattern() support.\n     *\n     * @param pattern source\n     * @param customPatterns The custom patterns to re-insert, if any\n     * @return full pattern\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 67)",
        "(line 410,col 9)-(line 410,col 49)",
        "(line 411,col 9)-(line 411,col 20)",
        "(line 412,col 9)-(line 412,col 22)",
        "(line 413,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.seekNonWs(java.lang.String, java.text.ParsePosition)",
      "begin_line": 448,
      "end_line": 455,
      "comment": "\n     * Consume whitespace from the current parse position.\n     * \n     * @param pattern String to read\n     * @param pos current position\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 20)",
        "(line 450,col 9)-(line 450,col 46)",
        "(line 451,col 9)-(line 454,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.next(java.text.ParsePosition)",
      "begin_line": 463,
      "end_line": 466,
      "comment": "\n     * Convenience method to advance parse position by 1\n     * \n     * @param pos ParsePosition\n     * @return \u003ccode\u003epos\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 41)",
        "(line 465,col 9)-(line 465,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.appendQuotedString(java.lang.String, java.text.ParsePosition, java.lang.StringBuilder, boolean)",
      "begin_line": 478,
      "end_line": 506,
      "comment": "\n     * Consume a quoted string, adding it to \u003ccode\u003eappendTo\u003c/code\u003e if\n     * specified.\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @param appendTo optional StringBuffer to append\n     * @param escapingOn whether to process escaped quotes\n     * @return \u003ccode\u003eappendTo\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 35)",
        "(line 481,col 9)-(line 481,col 41)",
        "(line 482,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 29)",
        "(line 487,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 505,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.getQuotedString(java.lang.String, java.text.ParsePosition, boolean)",
      "begin_line": 515,
      "end_line": 518,
      "comment": "\n     * Consume quoted string only\n     * \n     * @param pattern pattern to parse\n     * @param pos current parse position\n     * @param escapingOn whether to process escaped quotes\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.ExtendedMessageFormat.containsElements(java.util.Collection\u003c?\u003e)",
      "begin_line": 525,
      "end_line": 535,
      "comment": "\n     * Learn whether the specified Collection contains non-null elements.\n     * @param coll to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if some Object was found, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 21)"
      ]
    }
  ]
}