{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/linear/RealVectorFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.CompositeFormat"
      ],
      "begin_line": 44,
      "end_line": 334,
      "comment": "\n * Formats a vector in components list format \"{v0; v1; ...; vk-1}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SEPARATOR"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The default separator: \", \". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.text.NumberFormat)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 115,
      "end_line": 124,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 34)",
        "(line 118,col 9)-(line 118,col 34)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 120,col 41)",
        "(line 121,col 9)-(line 121,col 41)",
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getAvailableLocales()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Get the set of locales for which real vectors formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available real vector format locales.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getPrefix()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getSuffix()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getSeparator()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getFormat()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getInstance()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Returns the default real vector format for the current locale.\n     * @return the default real vector format.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getInstance(java.util.Locale)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns the default real vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the real vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.formatRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * This static method calls {@link #format(Object)} on a default instance of\n     * RealVectorFormat.\n     *\n     * @param v RealVector object to format\n     * @return A formatted vector\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.format(org.apache.commons.math.linear.RealVector, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 203,
      "end_line": 225,
      "comment": "\n     * Formats a {@link RealVector} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 29)",
        "(line 207,col 9)-(line 207,col 27)",
        "(line 210,col 9)-(line 210,col 34)",
        "(line 213,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 221,col 34)",
        "(line 223,col 9)-(line 223,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 239,
      "end_line": 248,
      "comment": "\n     * Formats a object to produce a string.\n     * \u003cp\u003e\u003ccode\u003eobj\u003c/code\u003e must be a  {@link RealVector} object. Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\u003c/p\u003e\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parse(java.lang.String)",
      "begin_line": 257,
      "end_line": 265,
      "comment": "\n     * Parses a string to produce a {@link RealVector} object.\n     * @param source the string to parse\n     * @return the parsed {@link RealVector} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 59)",
        "(line 259,col 9)-(line 259,col 61)",
        "(line 260,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 273,
      "end_line": 321,
      "comment": "\n     * Parses a string to produce a {@link RealVector} object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link RealVector} object.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 42)",
        "(line 277,col 9)-(line 277,col 46)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 283,col 9)-(line 283,col 58)",
        "(line 284,col 9)-(line 306,col 9)",
        "(line 309,col 9)-(line 309,col 46)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 315,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * Parses a string to produce a object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 34)"
      ]
    }
  ]
}