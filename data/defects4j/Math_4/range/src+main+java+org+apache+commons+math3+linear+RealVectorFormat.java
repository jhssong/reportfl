{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/RealVectorFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorFormat",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 289,
      "comment": "\n * Formats a vector in components list format \"{v0; v1; ...; vk-1}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SEPARATOR"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The default separator: \", \". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.RealVectorFormat()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.RealVectorFormat(java.text.NumberFormat)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.RealVectorFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 94,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.RealVectorFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 105,
      "end_line": 114,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 34)",
        "(line 108,col 9)-(line 108,col 34)",
        "(line 109,col 9)-(line 109,col 37)",
        "(line 110,col 9)-(line 110,col 41)",
        "(line 111,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 112,col 44)",
        "(line 113,col 9)-(line 113,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.getAvailableLocales()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Get the set of locales for which real vectors formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available real vector format locales.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.getPrefix()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.getSuffix()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.getSeparator()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.getFormat()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.getInstance()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Returns the default real vector format for the current locale.\n     * @return the default real vector format.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.getInstance(java.util.Locale)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Returns the default real vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the real vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.format(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * This method calls {@link #format(RealVector,StringBuffer,FieldPosition)}.\n     *\n     * @param v RealVector object to format.\n     * @return a formatted vector.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.format(org.apache.commons.math3.linear.RealVector, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 192,
      "end_line": 213,
      "comment": "\n     * Formats a {@link RealVector} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 29)",
        "(line 196,col 9)-(line 196,col 27)",
        "(line 199,col 9)-(line 199,col 34)",
        "(line 202,col 9)-(line 207,col 9)",
        "(line 210,col 9)-(line 210,col 34)",
        "(line 212,col 9)-(line 212,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.parse(java.lang.String)",
      "begin_line": 223,
      "end_line": 232,
      "comment": "\n     * Parse a string to produce a {@link RealVector} object.\n     *\n     * @param source String to parse.\n     * @return the parsed {@link RealVector} object.\n     * @throws MathParseException if the beginning of the specified string\n     * cannot be parsed.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 65)",
        "(line 225,col 9)-(line 225,col 68)",
        "(line 226,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 241,
      "end_line": 288,
      "comment": "\n     * Parse a string to produce a {@link RealVector} object.\n     *\n     * @param source String to parse.\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link RealVector} object.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 42)",
        "(line 245,col 9)-(line 245,col 62)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 251,col 9)-(line 251,col 58)",
        "(line 252,col 9)-(line 274,col 9)",
        "(line 277,col 9)-(line 277,col 62)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 283,col 9)-(line 283,col 54)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 48)"
      ]
    }
  ]
}