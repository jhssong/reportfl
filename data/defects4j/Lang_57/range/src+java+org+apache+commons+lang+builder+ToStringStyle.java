{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/builder/ToStringStyle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringStyle",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 69,
      "end_line": 2151,
      "comment": "\n * \u003cp\u003eControls \u003ccode\u003eString\u003c/code\u003e formatting for {@link ToStringBuilder}.\n * The main public interface is always via \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThese classes are intended to be used as \u003ccode\u003eSingletons\u003c/code\u003e.\n * There is no need to instantiate a new style each time. A program\n * will generally use one of the predefined constants on this class.\n * Alternatively, the {@link StandardToStringStyle} class can be used\n * to set the individual settings. Thus most styles can be achieved\n * without subclassing.\u003c/p\u003e\n *\n * \u003cp\u003eIf required, a subclass can override as many or as few of the\n * methods as it requires. Each object type (from \u003ccode\u003eboolean\u003c/code\u003e\n * to \u003ccode\u003elong\u003c/code\u003e to \u003ccode\u003eObject\u003c/code\u003e to \u003ccode\u003eint[]\u003c/code\u003e) has\n * its own methods to output it. Most have two versions, detail and summary.\n *\n * \u003cp\u003eFor example, the detail version of the array based methods will\n * output the whole array, whereas the summary method will just output\n * the array length.\u003c/p\u003e\n * \n * \u003cp\u003eIf you want to format the output of certain objects, such as dates, you\n * must create a subclass and override a method.\n * \u003cpre\u003e\n * public class MyStyle extends ToStringStyle {\n *   protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {\n *     if (value instanceof Date) {\n *       value \u003d new SimpleDateFormat(\"yyyy-MM-dd\").format(value);\n *     }\n *     buffer.append(value);\n *   }\n * }\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @author Masato Tezuka\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STYLE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * The default toString style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MULTI_LINE_STYLE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * The multi line toString style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NO_FIELD_NAMES_STYLE"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * The no field names toString style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_PREFIX_STYLE"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * The short prefix toString style.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIMPLE_STYLE"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * The simple toString style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useFieldNames"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Whether to use the field names, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useClassName"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Whether to use the class name, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useShortClassName"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Whether to use short class names, the default is \u003ccode\u003efalse\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useIdentityHashCode"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Whether to use the identity hash code, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contentStart"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * The content start \u003ccode\u003e\u0027[\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contentEnd"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * The content end \u003ccode\u003e\u0027]\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldNameValueSeparator"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * The field name value separator \u003ccode\u003e\u0027\u003d\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparatorAtStart"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * Whether the field separator should be added before any other fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparatorAtEnd"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Whether the field separator should be added after any other fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparator"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * The field separator \u003ccode\u003e\u0027,\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayStart"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     * The array start \u003ccode\u003e\u0027{\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arraySeparator"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * The array separator \u003ccode\u003e\u0027,\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayContentDetail"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": "\n     * The detail for array content.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayEnd"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * The array end \u003ccode\u003e\u0027}\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFullDetail"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": "\n     * The value to use when fullDetail is \u003ccode\u003enull\u003c/code\u003e,\n     * the default value is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nullText"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": "\n     * The \u003ccode\u003enull\u003c/code\u003e text \u003ccode\u003e\u0027\u0026lt;null\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sizeStartText"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": "\n     * The summary size text start \u003ccode\u003e\u0027\u003csize\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sizeEndText"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * The summary size text start \u003ccode\u003e\u0027\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "summaryObjectStartText"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * The summary object text start \u003ccode\u003e\u0027\u0026lt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "summaryObjectEndText"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * The summary object text start \u003ccode\u003e\u0027\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.ToStringStyle()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSuper(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the superclass toString.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e \u003ccode\u003esuperToString\u003c/code\u003e is ignored.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param superToString  the \u003ccode\u003esuper.toString()\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendToString(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 231,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e another toString.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e \u003ccode\u003etoString\u003c/code\u003e is ignored.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param toString  the additional \u003ccode\u003etoString\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendStart(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 252,
      "end_line": 261,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the start of data indicator.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to build a \u003ccode\u003etoString\u003c/code\u003e for\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendEnd(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 270,
      "end_line": 275,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the end of data indicator.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to build a\n     *  \u003ccode\u003etoString\u003c/code\u003e for.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.removeLastFieldSeparator(java.lang.StringBuffer)",
      "begin_line": 283,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eRemove the last field separator from the buffer.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 34)",
        "(line 285,col 9)-(line 285,col 45)",
        "(line 286,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, java.lang.Object, java.lang.Boolean)",
      "begin_line": 313,
      "end_line": 324,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing the full \u003ccode\u003etoString\u003c/code\u003e of the\n     * \u003ccode\u003eObject\u003c/code\u003e passed in.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 44)",
        "(line 316,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 323,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendInternal(java.lang.StringBuffer, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 345,
      "end_line": 434,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e,\n     * correctly interpreting its type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method performs the main lookup by Class type to correctly\n     * route arrays, \u003ccode\u003eCollections\u003c/code\u003e, \u003ccode\u003eMaps\u003c/code\u003e and\n     * \u003ccode\u003eObjects\u003c/code\u003e to the appropriate method.\u003c/p\u003e\n     *\n     * \u003cp\u003eEither detail or summary views can be specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a cycle is detected, an object will be appended with the\n     * \u003ccode\u003eObject.toString()\u003c/code\u003e format.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     * @param detail  output detail or not\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing the full detail of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Collection)",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eCollection\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param coll  the \u003ccode\u003eCollection\u003c/code\u003e to add to the\n     *  \u003ccode\u003etoString\u003c/code\u003e, not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Map)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eMap\u003ccode\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param map  the \u003ccode\u003eMap\u003c/code\u003e to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 482,
      "end_line": 486,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing a summary of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/P\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 46)",
        "(line 484,col 9)-(line 484,col 59)",
        "(line 485,col 9)-(line 485,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, long)",
      "begin_line": 498,
      "end_line": 502,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 44)",
        "(line 500,col 9)-(line 500,col 47)",
        "(line 501,col 9)-(line 501,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, long)",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 526,
      "end_line": 530,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 44)",
        "(line 528,col 9)-(line 528,col 47)",
        "(line 529,col 9)-(line 529,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, short)",
      "begin_line": 554,
      "end_line": 558,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 44)",
        "(line 556,col 9)-(line 556,col 47)",
        "(line 557,col 9)-(line 557,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, short)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, byte)",
      "begin_line": 582,
      "end_line": 586,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 44)",
        "(line 584,col 9)-(line 584,col 47)",
        "(line 585,col 9)-(line 585,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, byte)",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, char)",
      "begin_line": 610,
      "end_line": 614,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 44)",
        "(line 612,col 9)-(line 612,col 47)",
        "(line 613,col 9)-(line 613,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, char)",
      "begin_line": 624,
      "end_line": 626,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, double)",
      "begin_line": 638,
      "end_line": 642,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 44)",
        "(line 640,col 9)-(line 640,col 47)",
        "(line 641,col 9)-(line 641,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, double)",
      "begin_line": 652,
      "end_line": 654,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, float)",
      "begin_line": 666,
      "end_line": 670,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 44)",
        "(line 668,col 9)-(line 668,col 47)",
        "(line 669,col 9)-(line 669,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, float)",
      "begin_line": 680,
      "end_line": 682,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, boolean)",
      "begin_line": 694,
      "end_line": 698,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 44)",
        "(line 696,col 9)-(line 696,col 47)",
        "(line 697,col 9)-(line 697,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, boolean)",
      "begin_line": 708,
      "end_line": 710,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, java.lang.Object[], java.lang.Boolean)",
      "begin_line": 722,
      "end_line": 736,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 44)",
        "(line 725,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 735,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object[])",
      "begin_line": 749,
      "end_line": 764,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an\n     * \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 34)",
        "(line 751,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 763,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.reflectionAppendArrayDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 775,
      "end_line": 791,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an array type.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 34)",
        "(line 777,col 9)-(line 777,col 44)",
        "(line 778,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object[])",
      "begin_line": 802,
      "end_line": 804,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of an\n     * \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, long[], java.lang.Boolean)",
      "begin_line": 818,
      "end_line": 832,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 44)",
        "(line 821,col 9)-(line 829,col 9)",
        "(line 831,col 9)-(line 831,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, long[])",
      "begin_line": 843,
      "end_line": 852,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 34)",
        "(line 845,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 851,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, long[])",
      "begin_line": 863,
      "end_line": 865,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, int[], java.lang.Boolean)",
      "begin_line": 879,
      "end_line": 893,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 44)",
        "(line 882,col 9)-(line 890,col 9)",
        "(line 892,col 9)-(line 892,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, int[])",
      "begin_line": 904,
      "end_line": 913,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an\n     * \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 34)",
        "(line 906,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, int[])",
      "begin_line": 924,
      "end_line": 926,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of an\n     * \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, short[], java.lang.Boolean)",
      "begin_line": 940,
      "end_line": 954,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 44)",
        "(line 943,col 9)-(line 951,col 9)",
        "(line 953,col 9)-(line 953,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, short[])",
      "begin_line": 965,
      "end_line": 974,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 966,col 34)",
        "(line 967,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 973,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, short[])",
      "begin_line": 985,
      "end_line": 987,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, byte[], java.lang.Boolean)",
      "begin_line": 1001,
      "end_line": 1015,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 44)",
        "(line 1004,col 9)-(line 1012,col 9)",
        "(line 1014,col 9)-(line 1014,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, byte[])",
      "begin_line": 1026,
      "end_line": 1035,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1027,col 34)",
        "(line 1028,col 9)-(line 1033,col 9)",
        "(line 1034,col 9)-(line 1034,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, byte[])",
      "begin_line": 1046,
      "end_line": 1048,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, char[], java.lang.Boolean)",
      "begin_line": 1062,
      "end_line": 1076,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1063,col 44)",
        "(line 1065,col 9)-(line 1073,col 9)",
        "(line 1075,col 9)-(line 1075,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, char[])",
      "begin_line": 1087,
      "end_line": 1096,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 34)",
        "(line 1089,col 9)-(line 1094,col 9)",
        "(line 1095,col 9)-(line 1095,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, char[])",
      "begin_line": 1107,
      "end_line": 1109,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1108,col 9)-(line 1108,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, double[], java.lang.Boolean)",
      "begin_line": 1123,
      "end_line": 1137,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 44)",
        "(line 1126,col 9)-(line 1134,col 9)",
        "(line 1136,col 9)-(line 1136,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, double[])",
      "begin_line": 1148,
      "end_line": 1157,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1149,col 9)-(line 1149,col 34)",
        "(line 1150,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1156,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, double[])",
      "begin_line": 1168,
      "end_line": 1170,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1169,col 9)-(line 1169,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, float[], java.lang.Boolean)",
      "begin_line": 1184,
      "end_line": 1198,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 44)",
        "(line 1187,col 9)-(line 1195,col 9)",
        "(line 1197,col 9)-(line 1197,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, float[])",
      "begin_line": 1209,
      "end_line": 1218,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 34)",
        "(line 1211,col 9)-(line 1216,col 9)",
        "(line 1217,col 9)-(line 1217,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, float[])",
      "begin_line": 1229,
      "end_line": 1231,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1230,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, boolean[], java.lang.Boolean)",
      "begin_line": 1245,
      "end_line": 1259,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1246,col 9)-(line 1246,col 44)",
        "(line 1248,col 9)-(line 1256,col 9)",
        "(line 1258,col 9)-(line 1258,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, boolean[])",
      "begin_line": 1270,
      "end_line": 1279,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1271,col 9)-(line 1271,col 34)",
        "(line 1272,col 9)-(line 1277,col 9)",
        "(line 1278,col 9)-(line 1278,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, boolean[])",
      "begin_line": 1290,
      "end_line": 1292,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1291,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendClassName(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 1302,
      "end_line": 1310,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the class name.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose name to output\n     ",
      "child_ranges": [
        "(line 1303,col 9)-(line 1309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendIdentityHashCode(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 1318,
      "end_line": 1323,
      "comment": "\n     * \u003cp\u003eAppend the {@link System#identityHashCode(java.lang.Object)}.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose id to output\n     ",
      "child_ranges": [
        "(line 1319,col 9)-(line 1322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendContentStart(java.lang.StringBuffer)",
      "begin_line": 1330,
      "end_line": 1332,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the content start.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1331,col 9)-(line 1331,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendContentEnd(java.lang.StringBuffer)",
      "begin_line": 1339,
      "end_line": 1341,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the content end.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1340,col 9)-(line 1340,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendNullText(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1351,
      "end_line": 1353,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an indicator for \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default indicator is \u003ccode\u003e\u0027\u0026lt;null\u0026gt;\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     ",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendFieldSeparator(java.lang.StringBuffer)",
      "begin_line": 1360,
      "end_line": 1362,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the field separator.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1361,col 9)-(line 1361,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendFieldStart(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1370,
      "end_line": 1375,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the field start.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     ",
      "child_ranges": [
        "(line 1371,col 9)-(line 1374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendFieldEnd(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1383,
      "end_line": 1385,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003ccode\u003e the field end.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     ",
      "child_ranges": [
        "(line 1384,col 9)-(line 1384,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummarySize(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 1402,
      "end_line": 1406,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a size summary.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe size summary is used to summarize the contents of\n     * \u003ccode\u003eCollections\u003c/code\u003e, \u003ccode\u003eMaps\u003c/code\u003e and arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output consists of a prefix, the passed in size\n     * and a suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default format is \u003ccode\u003e\u0027\u0026lt;size\u003dn\u0026gt;\u0027\u003ccode\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param size  the size to append\n     ",
      "child_ranges": [
        "(line 1403,col 9)-(line 1403,col 37)",
        "(line 1404,col 9)-(line 1404,col 28)",
        "(line 1405,col 9)-(line 1405,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isFullDetail(java.lang.Boolean)",
      "begin_line": 1422,
      "end_line": 1427,
      "comment": "\n     * \u003cp\u003eIs this field to be output in full detail.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method converts a detail request into a detail level.\n     * The calling code may request full detail (\u003ccode\u003etrue\u003c/code\u003e),\n     * but a subclass might ignore that and always return\n     * \u003ccode\u003efalse\u003c/code\u003e. The calling code may pass in\n     * \u003ccode\u003enull\u003c/code\u003e indicating that it doesn\u0027t care about\n     * the detail level. In this case the default detail level is\n     * used.\u003c/p\u003e\n     * \n     * @param fullDetailRequest  the detail level requested\n     * @return whether full detail is to be shown\n     ",
      "child_ranges": [
        "(line 1423,col 9)-(line 1425,col 9)",
        "(line 1426,col 9)-(line 1426,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getShortClassName(java.lang.Class)",
      "begin_line": 1438,
      "end_line": 1440,
      "comment": "\n     * \u003cp\u003eGets the short class name for a class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe short class name is the classname excluding\n     * the package name.\u003c/p\u003e\n     *\n     * @param cls  the \u003ccode\u003eClass\u003c/code\u003e to get the short name of\n     * @return the short name\n     ",
      "child_ranges": [
        "(line 1439,col 9)-(line 1439,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseClassName()",
      "begin_line": 1452,
      "end_line": 1454,
      "comment": "\n     * \u003cp\u003eGets whether to use the class name.\u003c/p\u003e\n     *\n     * @return the current useClassName flag\n     ",
      "child_ranges": [
        "(line 1453,col 9)-(line 1453,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseClassName(boolean)",
      "begin_line": 1461,
      "end_line": 1463,
      "comment": "\n     * \u003cp\u003eSets whether to use the class name.\u003c/p\u003e\n     *\n     * @param useClassName  the new useClassName flag\n     ",
      "child_ranges": [
        "(line 1462,col 9)-(line 1462,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseShortClassName()",
      "begin_line": 1473,
      "end_line": 1475,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1474,col 9)-(line 1474,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isShortClassName()",
      "begin_line": 1484,
      "end_line": 1486,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current shortClassName flag\n     * @deprecated Use {@link #isUseShortClassName()}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 1485,col 9)-(line 1485,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseShortClassName(boolean)",
      "begin_line": 1494,
      "end_line": 1496,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param useShortClassName  the new useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1495,col 9)-(line 1495,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setShortClassName(boolean)",
      "begin_line": 1505,
      "end_line": 1507,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param shortClassName  the new shortClassName flag\n     * @deprecated Use {@link #setUseShortClassName(boolean)}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 1506,col 9)-(line 1506,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseIdentityHashCode()",
      "begin_line": 1516,
      "end_line": 1518,
      "comment": "\n     * \u003cp\u003eGets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @return the current useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 1517,col 9)-(line 1517,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseIdentityHashCode(boolean)",
      "begin_line": 1525,
      "end_line": 1527,
      "comment": "\n     * \u003cp\u003eSets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @param useIdentityHashCode  the new useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 1526,col 9)-(line 1526,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseFieldNames()",
      "begin_line": 1536,
      "end_line": 1538,
      "comment": "\n     * \u003cp\u003eGets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @return the current useFieldNames flag\n     ",
      "child_ranges": [
        "(line 1537,col 9)-(line 1537,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseFieldNames(boolean)",
      "begin_line": 1545,
      "end_line": 1547,
      "comment": "\n     * \u003cp\u003eSets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @param useFieldNames  the new useFieldNames flag\n     ",
      "child_ranges": [
        "(line 1546,col 9)-(line 1546,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isDefaultFullDetail()",
      "begin_line": 1557,
      "end_line": 1559,
      "comment": "\n     * \u003cp\u003eGets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @return the current defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 1558,col 9)-(line 1558,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setDefaultFullDetail(boolean)",
      "begin_line": 1567,
      "end_line": 1569,
      "comment": "\n     * \u003cp\u003eSets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @param defaultFullDetail  the new defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 1568,col 9)-(line 1568,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isArrayContentDetail()",
      "begin_line": 1578,
      "end_line": 1580,
      "comment": "\n     * \u003cp\u003eGets whether to output array content detail.\u003c/p\u003e\n     *\n     * @return the current array content detail setting\n     ",
      "child_ranges": [
        "(line 1579,col 9)-(line 1579,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArrayContentDetail(boolean)",
      "begin_line": 1587,
      "end_line": 1589,
      "comment": "\n     * \u003cp\u003eSets whether to output array content detail.\u003c/p\u003e\n     *\n     * @param arrayContentDetail  the new arrayContentDetail flag\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1588,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getArrayStart()",
      "begin_line": 1598,
      "end_line": 1600,
      "comment": "\n     * \u003cp\u003eGets the array start text.\u003c/p\u003e\n     *\n     * @return the current array start text\n     ",
      "child_ranges": [
        "(line 1599,col 9)-(line 1599,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArrayStart(java.lang.String)",
      "begin_line": 1610,
      "end_line": 1615,
      "comment": "\n     * \u003cp\u003eSets the array start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arrayStart  the new array start text\n     ",
      "child_ranges": [
        "(line 1611,col 9)-(line 1613,col 9)",
        "(line 1614,col 9)-(line 1614,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getArrayEnd()",
      "begin_line": 1624,
      "end_line": 1626,
      "comment": "\n     * \u003cp\u003eGets the array end text.\u003c/p\u003e\n     *\n     * @return the current array end text\n     ",
      "child_ranges": [
        "(line 1625,col 9)-(line 1625,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArrayEnd(java.lang.String)",
      "begin_line": 1636,
      "end_line": 1641,
      "comment": "\n     * \u003cp\u003eSets the array end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arrayEnd  the new array end text\n     ",
      "child_ranges": [
        "(line 1637,col 9)-(line 1639,col 9)",
        "(line 1640,col 9)-(line 1640,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getArraySeparator()",
      "begin_line": 1650,
      "end_line": 1652,
      "comment": "\n     * \u003cp\u003eGets the array separator text.\u003c/p\u003e\n     *\n     * @return the current array separator text\n     ",
      "child_ranges": [
        "(line 1651,col 9)-(line 1651,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArraySeparator(java.lang.String)",
      "begin_line": 1662,
      "end_line": 1667,
      "comment": "\n     * \u003cp\u003eSets the array separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arraySeparator  the new array separator text\n     ",
      "child_ranges": [
        "(line 1663,col 9)-(line 1665,col 9)",
        "(line 1666,col 9)-(line 1666,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getContentStart()",
      "begin_line": 1676,
      "end_line": 1678,
      "comment": "\n     * \u003cp\u003eGets the content start text.\u003c/p\u003e\n     *\n     * @return the current content start text\n     ",
      "child_ranges": [
        "(line 1677,col 9)-(line 1677,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setContentStart(java.lang.String)",
      "begin_line": 1688,
      "end_line": 1693,
      "comment": "\n     * \u003cp\u003eSets the content start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param contentStart  the new content start text\n     ",
      "child_ranges": [
        "(line 1689,col 9)-(line 1691,col 9)",
        "(line 1692,col 9)-(line 1692,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getContentEnd()",
      "begin_line": 1702,
      "end_line": 1704,
      "comment": "\n     * \u003cp\u003eGets the content end text.\u003c/p\u003e\n     *\n     * @return the current content end text\n     ",
      "child_ranges": [
        "(line 1703,col 9)-(line 1703,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setContentEnd(java.lang.String)",
      "begin_line": 1714,
      "end_line": 1719,
      "comment": "\n     * \u003cp\u003eSets the content end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param contentEnd  the new content end text\n     ",
      "child_ranges": [
        "(line 1715,col 9)-(line 1717,col 9)",
        "(line 1718,col 9)-(line 1718,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getFieldNameValueSeparator()",
      "begin_line": 1728,
      "end_line": 1730,
      "comment": "\n     * \u003cp\u003eGets the field name value separator text.\u003c/p\u003e\n     *\n     * @return the current field name value separator text\n     ",
      "child_ranges": [
        "(line 1729,col 9)-(line 1729,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldNameValueSeparator(java.lang.String)",
      "begin_line": 1740,
      "end_line": 1745,
      "comment": "\n     * \u003cp\u003eSets the field name value separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param fieldNameValueSeparator  the new field name value separator text\n     ",
      "child_ranges": [
        "(line 1741,col 9)-(line 1743,col 9)",
        "(line 1744,col 9)-(line 1744,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getFieldSeparator()",
      "begin_line": 1754,
      "end_line": 1756,
      "comment": "\n     * \u003cp\u003eGets the field separator text.\u003c/p\u003e\n     *\n     * @return the current field separator text\n     ",
      "child_ranges": [
        "(line 1755,col 9)-(line 1755,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldSeparator(java.lang.String)",
      "begin_line": 1766,
      "end_line": 1771,
      "comment": "\n     * \u003cp\u003eSets the field separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param fieldSeparator  the new field separator text\n     ",
      "child_ranges": [
        "(line 1767,col 9)-(line 1769,col 9)",
        "(line 1770,col 9)-(line 1770,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isFieldSeparatorAtStart()",
      "begin_line": 1782,
      "end_line": 1784,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1783,col 9)-(line 1783,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldSeparatorAtStart(boolean)",
      "begin_line": 1793,
      "end_line": 1795,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1794,col 9)-(line 1794,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isFieldSeparatorAtEnd()",
      "begin_line": 1806,
      "end_line": 1808,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1807,col 9)-(line 1807,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldSeparatorAtEnd(boolean)",
      "begin_line": 1817,
      "end_line": 1819,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1818,col 9)-(line 1818,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getNullText()",
      "begin_line": 1828,
      "end_line": 1830,
      "comment": "\n     * \u003cp\u003eGets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * @return the current text to output when null found\n     ",
      "child_ranges": [
        "(line 1829,col 9)-(line 1829,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setNullText(java.lang.String)",
      "begin_line": 1840,
      "end_line": 1845,
      "comment": "\n     * \u003cp\u003eSets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param nullText  the new text to output when null found\n     ",
      "child_ranges": [
        "(line 1841,col 9)-(line 1843,col 9)",
        "(line 1844,col 9)-(line 1844,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSizeStartText()",
      "begin_line": 1857,
      "end_line": 1859,
      "comment": "\n     * \u003cp\u003eGets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of size text\n     ",
      "child_ranges": [
        "(line 1858,col 9)-(line 1858,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSizeStartText(java.lang.String)",
      "begin_line": 1872,
      "end_line": 1877,
      "comment": "\n     * \u003cp\u003eSets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeStartText  the new start of size text\n     ",
      "child_ranges": [
        "(line 1873,col 9)-(line 1875,col 9)",
        "(line 1876,col 9)-(line 1876,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSizeEndText()",
      "begin_line": 1889,
      "end_line": 1891,
      "comment": "\n     * \u003cp\u003eGets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of size text\n     ",
      "child_ranges": [
        "(line 1890,col 9)-(line 1890,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSizeEndText(java.lang.String)",
      "begin_line": 1904,
      "end_line": 1909,
      "comment": "\n     * \u003cp\u003eSets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeEndText  the new end of size text\n     ",
      "child_ranges": [
        "(line 1905,col 9)-(line 1907,col 9)",
        "(line 1908,col 9)-(line 1908,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSummaryObjectStartText()",
      "begin_line": 1921,
      "end_line": 1923,
      "comment": "\n     * \u003cp\u003eGets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of summary text\n     ",
      "child_ranges": [
        "(line 1922,col 9)-(line 1922,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSummaryObjectStartText(java.lang.String)",
      "begin_line": 1936,
      "end_line": 1941,
      "comment": "\n     * \u003cp\u003eSets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectStartText  the new start of summary text\n     ",
      "child_ranges": [
        "(line 1937,col 9)-(line 1939,col 9)",
        "(line 1940,col 9)-(line 1940,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSummaryObjectEndText()",
      "begin_line": 1953,
      "end_line": 1955,
      "comment": "\n     * \u003cp\u003eGets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of summary text\n     ",
      "child_ranges": [
        "(line 1954,col 9)-(line 1954,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSummaryObjectEndText(java.lang.String)",
      "begin_line": 1968,
      "end_line": 1973,
      "comment": "\n     * \u003cp\u003eSets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectEndText  the new end of summary text\n     ",
      "child_ranges": [
        "(line 1969,col 9)-(line 1971,col 9)",
        "(line 1972,col 9)-(line 1972,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 1983,
      "end_line": 2010,
      "comment": "\n     * \u003cp\u003eDefault \u003ccode\u003eToStringStyle\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1990,
      "end_line": 1990,
      "comment": "\n         * Required for serialization support.\n         * \n         * @see java.io.Serializable\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.DefaultToStringStyle.DefaultToStringStyle()",
      "begin_line": 1997,
      "end_line": 1999,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 1998,col 13)-(line 1998,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.DefaultToStringStyle.readResolve()",
      "begin_line": 2006,
      "end_line": 2008,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2007,col 13)-(line 2007,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoFieldNameToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2021,
      "end_line": 2044,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that does not print out\n     * the field names.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2023,
      "end_line": 2023,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.NoFieldNameToStringStyle.NoFieldNameToStringStyle()",
      "begin_line": 2030,
      "end_line": 2033,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2031,col 13)-(line 2031,col 20)",
        "(line 2032,col 13)-(line 2032,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.NoFieldNameToStringStyle.readResolve()",
      "begin_line": 2040,
      "end_line": 2042,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2041,col 13)-(line 2041,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ShortPrefixToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2055,
      "end_line": 2078,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that prints out the short\n     * class name and no identity hashcode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2057,
      "end_line": 2057,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.ShortPrefixToStringStyle.ShortPrefixToStringStyle()",
      "begin_line": 2064,
      "end_line": 2068,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2065,col 13)-(line 2065,col 20)",
        "(line 2066,col 13)-(line 2066,col 44)",
        "(line 2067,col 13)-(line 2067,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.ShortPrefixToStringStyle.readResolve()",
      "begin_line": 2074,
      "end_line": 2076,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/ode\u003e after serialization.\u003c/p\u003e\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2075,col 13)-(line 2075,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SimpleToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2087,
      "end_line": 2113,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that does not print out the\n     * classname, identity hashcode, content start or field name.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2089,
      "end_line": 2089,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.SimpleToStringStyle()",
      "begin_line": 2096,
      "end_line": 2103,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2097,col 13)-(line 2097,col 20)",
        "(line 2098,col 13)-(line 2098,col 40)",
        "(line 2099,col 13)-(line 2099,col 47)",
        "(line 2100,col 13)-(line 2100,col 41)",
        "(line 2101,col 13)-(line 2101,col 37)",
        "(line 2102,col 13)-(line 2102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.readResolve()",
      "begin_line": 2109,
      "end_line": 2111,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/ode\u003e after serialization.\u003c/p\u003e\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2110,col 13)-(line 2110,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiLineToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2123,
      "end_line": 2149,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that outputs on multiple lines.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2125,
      "end_line": 2125,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle.MultiLineToStringStyle()",
      "begin_line": 2132,
      "end_line": 2138,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2133,col 13)-(line 2133,col 20)",
        "(line 2134,col 13)-(line 2134,col 38)",
        "(line 2135,col 13)-(line 2135,col 70)",
        "(line 2136,col 13)-(line 2136,col 48)",
        "(line 2137,col 13)-(line 2137,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle.readResolve()",
      "begin_line": 2145,
      "end_line": 2147,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2146,col 13)-(line 2146,col 50)"
      ]
    }
  ]
}