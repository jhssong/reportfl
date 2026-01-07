{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/builder/StandardToStringStyle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 33,
      "end_line": 537,
      "comment": "\n * \u003cp\u003eWorks with {@link ToStringBuilder} to create a \u003ccode\u003etoString\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is intended to be used as a singleton.\n * There is no need to instantiate a new style each time.\n * Simply instantiate the class once, customize the values as required, and\n * store the result in a public static final variable for the rest of the\n * program to access.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Pete Gieser\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.StandardToStringStyle()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseClassName()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * \u003cp\u003eGets whether to use the class name.\u003c/p\u003e\n     *\n     * @return the current useClassName flag\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseClassName(boolean)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * \u003cp\u003eSets whether to use the class name.\u003c/p\u003e\n     *\n     * @param useClassName  the new useClassName flag\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseShortClassName()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isShortClassName()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current shortClassName flag\n     * @deprecated Use {@link #isUseShortClassName()}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseShortClassName(boolean)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param useShortClassName  the new useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setShortClassName(boolean)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param shortClassName  the new shortClassName flag\n     * @deprecated Use {@link #setUseShortClassName(boolean)}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseIdentityHashCode()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * \u003cp\u003eGets whether to use the identity hash code.\u003c/p\u003e\n     * @return the current useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseIdentityHashCode(boolean)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * \u003cp\u003eSets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @param useIdentityHashCode  the new useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isUseFieldNames()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * \u003cp\u003eGets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @return the current useFieldNames flag\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setUseFieldNames(boolean)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * \u003cp\u003eSets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @param useFieldNames  the new useFieldNames flag\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isDefaultFullDetail()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eGets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @return the current defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setDefaultFullDetail(boolean)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * \u003cp\u003eSets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @param defaultFullDetail  the new defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isArrayContentDetail()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * \u003cp\u003eGets whether to output array content detail.\u003c/p\u003e\n     *\n     * @return the current array content detail setting\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArrayContentDetail(boolean)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * \u003cp\u003eSets whether to output array content detail.\u003c/p\u003e\n     *\n     * @param arrayContentDetail  the new arrayContentDetail flag\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getArrayStart()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eGets the array start text.\u003c/p\u003e\n     *\n     * @return the current array start text\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArrayStart(java.lang.String)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * \u003cp\u003eSets the array start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arrayStart  the new array start text\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getArrayEnd()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * \u003cp\u003eGets the array end text.\u003c/p\u003e\n     *\n     * @return the current array end text\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArrayEnd(java.lang.String)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * \u003cp\u003eSets the array end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arrayEnd  the new array end text\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getArraySeparator()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eGets the array separator text.\u003c/p\u003e\n     *\n     * @return the current array separator text\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setArraySeparator(java.lang.String)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * \u003cp\u003eSets the array separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param arraySeparator  the new array separator text\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getContentStart()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * \u003cp\u003eGets the content start text.\u003c/p\u003e\n     *\n     * @return the current content start text\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setContentStart(java.lang.String)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * \u003cp\u003eSets the content start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param contentStart  the new content start text\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getContentEnd()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003eGets the content end text.\u003c/p\u003e\n     *\n     * @return the current content end text\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setContentEnd(java.lang.String)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * \u003cp\u003eSets the content end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param contentEnd  the new content end text\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getFieldNameValueSeparator()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eGets the field name value separator text.\u003c/p\u003e\n     *\n     * @return the current field name value separator text\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldNameValueSeparator(java.lang.String)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * \u003cp\u003eSets the field name value separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param fieldNameValueSeparator  the new field name value separator text\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getFieldSeparator()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * \u003cp\u003eGets the field separator text.\u003c/p\u003e\n     *\n     * @return the current field separator text\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldSeparator(java.lang.String)",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n     * \u003cp\u003eSets the field separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param fieldSeparator  the new field separator text\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isFieldSeparatorAtStart()",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldSeparatorAtStart(boolean)",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.isFieldSeparatorAtEnd()",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setFieldSeparatorAtEnd(boolean)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getNullText()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * \u003cp\u003eGets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * @return the current text to output when \u003ccode\u003enull\u003c/code\u003e found\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setNullText(java.lang.String)",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n     * \u003cp\u003eSets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param nullText  the new text to output when \u003ccode\u003enull\u003c/code\u003e found\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSizeStartText()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * \u003cp\u003eGets the text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of size text\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSizeStartText(java.lang.String)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * \u003cp\u003eSets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeStartText  the new start of size text\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSizeEndText()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n     * Gets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of size text\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSizeEndText(java.lang.String)",
      "begin_line": 473,
      "end_line": 475,
      "comment": "\n     * \u003cp\u003eSets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or \u003ccode\u003eArray\u003c/code\u003e size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted\n     * to an empty String.\u003c/p\u003e\n     *\n     * @param sizeEndText  the new end of size text\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSummaryObjectStartText()",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n     * \u003cp\u003eGets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cP\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of summary text\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSummaryObjectStartText(java.lang.String)",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\n     * \u003cp\u003eSets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectStartText  the new start of summary text\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.getSummaryObjectEndText()",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n     * \u003cp\u003eGets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of summary text\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.StandardToStringStyle.setSummaryObjectEndText(java.lang.String)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\n     * \u003cp\u003eSets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectEndText  the new end of summary text\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 60)"
      ]
    }
  ]
}