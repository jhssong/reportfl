{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/geometry/Vector3DFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3DFormat",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.CompositeFormat"
      ],
      "begin_line": 42,
      "end_line": 342,
      "comment": "\n * Formats a 3D vector in components list format \"{x; y; z}\".\n * \u003cp\u003eThe prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by\n * any user-defined strings. The number format for components can be configured.\u003c/p\u003e\n * \u003cp\u003eWhite space is ignored at parse time, even if it is in the prefix, suffix\n * or separator specifications. So even if the default separator does include a space\n * character that is used at format time, both input string \"{1;1;1}\" and\n * \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be\n * returned. In the second case, however, the parse position after parsing will be\n * just after the closing curly brace, i.e. just before the trailing space.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The default prefix: \"{\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The default suffix: \"}\". "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SEPARATOR"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The default separator: \", \". "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedPrefix"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Trimmed prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSuffix"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Trimmed suffix. "
    },
    {
      "type": "field",
      "varNames": [
        "trimmedSeparator"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Trimmed separator. "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The format used for components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Create an instance with default settings.\n     * \u003cp\u003eThe instance uses the default prefix, suffix and separator:\n     * \"{\", \"}\", and \"; \" and the default number format for components.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.text.NumberFormat)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Create an instance with a custom number format for components.\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * Create an instance with custom prefix, suffix and separator.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.Vector3DFormat(java.lang.String, java.lang.String, java.lang.String, java.text.NumberFormat)",
      "begin_line": 113,
      "end_line": 122,
      "comment": "\n     * Create an instance with custom prefix, suffix, separator and format\n     * for components.\n     * @param prefix prefix to use instead of the default \"{\"\n     * @param suffix suffix to use instead of the default \"}\"\n     * @param separator separator to use instead of the default \"; \"\n     * @param format the custom format for components.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 34)",
        "(line 116,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 119,col 41)",
        "(line 120,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 121,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getAvailableLocales()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Get the set of locales for which 3D vectors formats are available.\n     * \u003cp\u003eThis is the same set as the {@link NumberFormat} set.\u003c/p\u003e\n     * @return available 3D vector format locales.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getPrefix()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Get the format prefix.\n     * @return format prefix.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getSuffix()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Get the format suffix.\n     * @return format suffix.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getSeparator()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Get the format separator between components.\n     * @return format separator.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getFormat()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Get the components format.\n     * @return components format.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getInstance()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Returns the default 3D vector format for the current locale.\n     * @return the default 3D vector format.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.getInstance(java.util.Locale)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Returns the default 3D vector format for the given locale.\n     * @param locale the specific locale used by the format.\n     * @return the 3D vector format specific to the given locale.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.formatVector3D(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * This static method calls {@link #format(Object)} on a default instance of\n     * Vector3DFormat.\n     *\n     * @param v Vector3D object to format\n     * @return A formatted vector\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.format(org.apache.commons.math.geometry.Vector3D, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 201,
      "end_line": 222,
      "comment": "\n     * Formats a {@link Vector3D} object to produce a string.\n     * @param vector the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 29)",
        "(line 205,col 9)-(line 205,col 27)",
        "(line 208,col 9)-(line 208,col 34)",
        "(line 211,col 9)-(line 211,col 61)",
        "(line 212,col 9)-(line 212,col 37)",
        "(line 213,col 9)-(line 213,col 61)",
        "(line 214,col 9)-(line 214,col 37)",
        "(line 215,col 9)-(line 215,col 61)",
        "(line 218,col 9)-(line 218,col 34)",
        "(line 220,col 9)-(line 220,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 236,
      "end_line": 247,
      "comment": "\n     * Formats a object to produce a string.\n     * \u003cp\u003e\u003ccode\u003eobj\u003c/code\u003e must be a  {@link Vector3D} object. Any other type of\n     * object will result in an {@link IllegalArgumentException} being thrown.\u003c/p\u003e\n     * @param obj the object to format.\n     * @param toAppendTo where the text is to be appended\n     * @param pos On input: an alignment field, if desired. On output: the\n     *            offsets of the alignment field\n     * @return the value passed in as toAppendTo.\n     * @see java.text.Format#format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)\n     * @throws IllegalArgumentException is \u003ccode\u003eobj\u003c/code\u003e is not a valid type.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 245,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parse(java.lang.String)",
      "begin_line": 256,
      "end_line": 265,
      "comment": "\n     * Parses a string to produce a {@link Vector3D} object.\n     * @param source the string to parse\n     * @return the parsed {@link Vector3D} object.\n     * @exception ParseException if the beginning of the specified string\n     *            cannot be parsed.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 59)",
        "(line 258,col 9)-(line 258,col 55)",
        "(line 259,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 273,
      "end_line": 328,
      "comment": "\n     * Parses a string to produce a {@link Vector3D} object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed {@link Vector3D} object.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 42)",
        "(line 277,col 9)-(line 277,col 46)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 283,col 9)-(line 283,col 46)",
        "(line 284,col 9)-(line 284,col 52)",
        "(line 285,col 9)-(line 290,col 9)",
        "(line 293,col 9)-(line 293,col 46)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 46)",
        "(line 298,col 9)-(line 298,col 52)",
        "(line 299,col 9)-(line 304,col 9)",
        "(line 307,col 9)-(line 307,col 46)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 46)",
        "(line 312,col 9)-(line 312,col 52)",
        "(line 313,col 9)-(line 318,col 9)",
        "(line 321,col 9)-(line 321,col 46)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 326,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3DFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\n     * Parses a string to produce a object.\n     * @param source the string to parse\n     * @param pos input/ouput parsing parameter.\n     * @return the parsed object.\n     * @see java.text.Format#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 34)"
      ]
    }
  ]
}