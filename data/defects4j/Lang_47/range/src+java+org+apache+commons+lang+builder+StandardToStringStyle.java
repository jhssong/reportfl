{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/builder/StandardToStringStyle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 34,
      "end_line": 545,
      "comment": "\n * \u003cp\u003eWorks with {@link ToStringBuilder} to create a \u003ccode\u003etoString\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is intended to be used as a singleton.\n * There is no need to instantiate a new style each time.\n * Simply instantiate the class once, customize the values as required, and\n * store the result in a public static final variable for the rest of the\n * program to access.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Pete Gieser\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.StandardToStringStyle()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseClassName()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * \u003cp\u003eGets whether to use the class name.\u003c/p\u003e\n     *\n     * @return the current useClassName flag\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseClassName(boolean)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * \u003cp\u003eSets whether to use the class name.\u003c/p\u003e\n     *\n     * @param useClassName  the new useClassName flag\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseShortClassName()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isShortClassName()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current shortClassName flag\n     * @deprecated Use {@link #isUseShortClassName()}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseShortClassName(boolean)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param useShortClassName  the new useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setShortClassName(boolean)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param shortClassName  the new shortClassName flag\n     * @deprecated Use {@link #setUseShortClassName(boolean)}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseIdentityHashCode()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * \u003cp\u003eGets whether to use the identity hash code.\u003c/p\u003e\n     * @return the current useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseIdentityHashCode(boolean)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eSets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @param useIdentityHashCode  the new useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseFieldNames()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eGets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @return the current useFieldNames flag\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseFieldNames(boolean)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * \u003cp\u003eSets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @param useFieldNames  the new useFieldNames flag\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isDefaultFullDetail()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003eGets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @return the current defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setDefaultFullDetail(boolean)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eSets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @param defaultFullDetail  the new defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isArrayContentDetail()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003eGets whether to output array content detail.\u003c/p\u003e\n     *\n     * @return the current array content detail setting\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArrayContentDetail(boolean)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * \u003cp\u003eSets whether to output array content detail.\u003c/p\u003e\n     *\n     * @param arrayContentDetail  the new arrayContentDetail flag\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getArrayStart()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eGets the array start text.\u003c/p\u003e\n     *\n     * @return the current array start text\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArrayStart(java.lang.String)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * \u003cp\u003eSets the array start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arrayStart  the new array start text\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getArrayEnd()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * \u003cp\u003eGets the array end text.\u003c/p\u003e\n     *\n     * @return the current array end text\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArrayEnd(java.lang.String)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * \u003cp\u003eSets the array end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arrayEnd  the new array end text\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getArraySeparator()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eGets the array separator text.\u003c/p\u003e\n     *\n     * @return the current array separator text\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArraySeparator(java.lang.String)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * \u003cp\u003eSets the array separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arraySeparator  the new array separator text\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getContentStart()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * \u003cp\u003eGets the content start text.\u003c/p\u003e\n     *\n     * @return the current content start text\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setContentStart(java.lang.String)",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * \u003cp\u003eSets the content start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param contentStart  the new content start text\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getContentEnd()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * \u003cp\u003eGets the content end text.\u003c/p\u003e\n     *\n     * @return the current content end text\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setContentEnd(java.lang.String)",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * \u003cp\u003eSets the content end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param contentEnd  the new content end text\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getFieldNameValueSeparator()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * \u003cp\u003eGets the field name value separator text.\u003c/p\u003e\n     *\n     * @return the current field name value separator text\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldNameValueSeparator(java.lang.String)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * \u003cp\u003eSets the field name value separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param fieldNameValueSeparator  the new field name value separator text\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getFieldSeparator()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * \u003cp\u003eGets the field separator text.\u003c/p\u003e\n     *\n     * @return the current field separator text\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldSeparator(java.lang.String)",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * \u003cp\u003eSets the field separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param fieldSeparator  the new field separator text\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isFieldSeparatorAtStart()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldSeparatorAtStart(boolean)",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isFieldSeparatorAtEnd()",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldSeparatorAtEnd(boolean)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getNullText()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * \u003cp\u003eGets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * @return the current text to output when \u003ccode\u003enull\u003c/code\u003e found\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setNullText(java.lang.String)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * \u003cp\u003eSets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param nullText  the new text to output when \u003ccode\u003enull\u003c/code\u003e found\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSizeStartText()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\n     * \u003cp\u003eGets the text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of size text\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSizeStartText(java.lang.String)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\n     * \u003cp\u003eSets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeStartText  the new start of size text\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSizeEndText()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n     * Gets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of size text\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSizeEndText(java.lang.String)",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * \u003cp\u003eSets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param sizeEndText  the new end of size text\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSummaryObjectStartText()",
      "begin_line": 495,
      "end_line": 497,
      "comment": "\n     * \u003cp\u003eGets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cP\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of summary text\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSummaryObjectStartText(java.lang.String)",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * \u003cp\u003eSets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectStartText  the new start of summary text\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSummaryObjectEndText()",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\n     * \u003cp\u003eGets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of summary text\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSummaryObjectEndText(java.lang.String)",
      "begin_line": 539,
      "end_line": 541,
      "comment": "\n     * \u003cp\u003eSets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectEndText  the new end of summary text\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 60)"
      ]
    }
  ]
}