{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/linear/RealVectorFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.CompositeFormat"
      ],
      "begin_line": 46,
      "end_line": 341,
      "comment": "\n * Formats a vector in components list format \"{v0; v1; ...; vk-1}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SEPARATOR"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The default separator: \", \". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.text.NumberFormat)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.RealVectorFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 117,
      "end_line": 126,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 34)",
        "(line 120,col 9)-(line 120,col 34)",
        "(line 121,col 9)-(line 121,col 37)",
        "(line 122,col 9)-(line 122,col 41)",
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 124,col 44)",
        "(line 125,col 9)-(line 125,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getAvailableLocales()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Get the set of locales for which real vectors formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available real vector format locales.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getPrefix()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getSuffix()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getSeparator()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getFormat()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getInstance()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Returns the default real vector format for the current locale.\n     * @return the default real vector format.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.getInstance(java.util.Locale)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Returns the default real vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the real vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.formatRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * This static method calls {@link #format(Object)} on a default instance of\n     * RealVectorFormat.\n     *\n     * @param v RealVector object to format\n     * @return A formatted vector\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.format(org.apache.commons.math.linear.RealVector, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 205,
      "end_line": 227,
      "comment": "\n     * Formats a {@link RealVector} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 29)",
        "(line 209,col 9)-(line 209,col 27)",
        "(line 212,col 9)-(line 212,col 34)",
        "(line 215,col 9)-(line 220,col 9)",
        "(line 223,col 9)-(line 223,col 34)",
        "(line 225,col 9)-(line 225,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 241,
      "end_line": 253,
      "comment": "\n     * Formats a object to produce a string.\n     * \u003cp\u003e\u003ccode\u003eobj\u003c/code\u003e must be a  {@link RealVector} object. Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\u003c/p\u003e\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 251,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parse(java.lang.String)",
      "begin_line": 262,
      "end_line": 271,
      "comment": "\n     * Parses a string to produce a {@link RealVector} object.\n     * @param source the string to parse\n     * @return the parsed {@link RealVector} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 59)",
        "(line 264,col 9)-(line 264,col 62)",
        "(line 265,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 279,
      "end_line": 327,
      "comment": "\n     * Parses a string to produce a {@link RealVector} object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link RealVector} object.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 42)",
        "(line 283,col 9)-(line 283,col 46)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 289,col 9)-(line 289,col 58)",
        "(line 290,col 9)-(line 312,col 9)",
        "(line 315,col 9)-(line 315,col 46)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 321,col 9)-(line 321,col 54)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 336,
      "end_line": 339,
      "comment": "\n     * Parses a string to produce a object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 34)"
      ]
    }
  ]
}