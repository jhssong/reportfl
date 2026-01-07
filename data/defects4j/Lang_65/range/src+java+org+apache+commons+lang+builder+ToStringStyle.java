{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/builder/ToStringStyle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringStyle",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 2135,
      "comment": "\n * \u003cp\u003eControls \u003ccode\u003eString\u003c/code\u003e formatting for {@link ToStringBuilder}.\n * The main public interface is always via \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThese classes are intended to be used as \u003ccode\u003eSingletons\u003c/code\u003e.\n * There is no need to instantiate a new style each time. A program\n * will generally use one of the predefined constants on this class.\n * Alternatively, the {@link StandardToStringStyle} class can be used\n * to set the individual settings. Thus most styles can be achieved\n * without subclassing.\u003c/p\u003e\n *\n * \u003cp\u003eIf required, a subclass can override as many or as few of the\n * methods as it requires. Each object type (from \u003ccode\u003eboolean\u003c/code\u003e\n * to \u003ccode\u003elong\u003c/code\u003e to \u003ccode\u003eObject\u003c/code\u003e to \u003ccode\u003eint[]\u003c/code\u003e) has\n * its own methods to output it. Most have two versions, detail and summary.\n *\n * \u003cp\u003eFor example, the detail version of the array based methods will\n * output the whole array, whereas the summary method will just output\n * the array length.\u003c/p\u003e\n * \n * \u003cp\u003eIf you want to format the output of certain objects, such as dates, you\n * must create a subclass and override a method.\n * \u003cpre\u003e\n * public class MyStyle extends ToStringStyle {\n *   protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {\n *     if (value instanceof Date) {\n *       value \u003d new SimpleDateFormat(\"yyyy-MM-dd\").format(value);\n *     }\n *     buffer.append(value);\n *   }\n * }\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @author Masato Tezuka\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STYLE"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * The default toString style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MULTI_LINE_STYLE"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * The multi line toString style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NO_FIELD_NAMES_STYLE"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * The no field names toString style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_PREFIX_STYLE"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * The short prefix toString style.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIMPLE_STYLE"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * The simple toString style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useFieldNames"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Whether to use the field names, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useClassName"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Whether to use the class name, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useShortClassName"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Whether to use short class names, the default is \u003ccode\u003efalse\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useIdentityHashCode"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Whether to use the identity hash code, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contentStart"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * The content start \u003ccode\u003e\u0027[\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contentEnd"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * The content end \u003ccode\u003e\u0027]\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldNameValueSeparator"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * The field name value separator \u003ccode\u003e\u0027\u003d\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparatorAtStart"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Whether the field separator should be added before any other fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparatorAtEnd"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Whether the field separator should be added after any other fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparator"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * The field separator \u003ccode\u003e\u0027,\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayStart"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * The array start \u003ccode\u003e\u0027{\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arraySeparator"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * The array separator \u003ccode\u003e\u0027,\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayContentDetail"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n     * The detail for array content.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayEnd"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": "\n     * The array end \u003ccode\u003e\u0027}\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFullDetail"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": "\n     * The value to use when fullDetail is \u003ccode\u003enull\u003c/code\u003e,\n     * the default value is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nullText"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n     * The \u003ccode\u003enull\u003c/code\u003e text \u003ccode\u003e\u0027\u0026lt;null\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sizeStartText"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * The summary size text start \u003ccode\u003e\u0027\u003csize\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sizeEndText"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": "\n     * The summary size text start \u003ccode\u003e\u0027\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "summaryObjectStartText"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n     * The summary object text start \u003ccode\u003e\u0027\u0026lt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "summaryObjectEndText"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * The summary object text start \u003ccode\u003e\u0027\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.ToStringStyle()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSuper(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the superclass toString.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e \u003ccode\u003esuperToString\u003c/code\u003e is ignored.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param superToString  the \u003ccode\u003esuper.toString()\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendToString(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 230,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e another toString.\u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e \u003ccode\u003etoString\u003c/code\u003e is ignored.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param toString  the additional \u003ccode\u003etoString\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendStart(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 251,
      "end_line": 260,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the start of data indicator.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to build a \u003ccode\u003etoString\u003c/code\u003e for\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendEnd(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 269,
      "end_line": 274,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the end of data indicator.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to build a\n     *  \u003ccode\u003etoString\u003c/code\u003e for.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.removeLastFieldSeparator(java.lang.StringBuffer)",
      "begin_line": 282,
      "end_line": 297,
      "comment": "\n     * \u003cp\u003eRemove the last field separator from the buffer.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 34)",
        "(line 284,col 9)-(line 284,col 45)",
        "(line 285,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, java.lang.Object, java.lang.Boolean)",
      "begin_line": 312,
      "end_line": 323,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing the full \u003ccode\u003etoString\u003c/code\u003e of the\n     * \u003ccode\u003eObject\u003c/code\u003e passed in.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 44)",
        "(line 315,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 322,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendInternal(java.lang.StringBuffer, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 344,
      "end_line": 433,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e,\n     * correctly interpreting its type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method performs the main lookup by Class type to correctly\n     * route arrays, \u003ccode\u003eCollections\u003c/code\u003e, \u003ccode\u003eMaps\u003c/code\u003e and\n     * \u003ccode\u003eObjects\u003c/code\u003e to the appropriate method.\u003c/p\u003e\n     *\n     * \u003cp\u003eEither detail or summary views can be specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a cycle is detected, an object will be appended with the\n     * \u003ccode\u003eObject.toString()\u003c/code\u003e format.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     * @param detail  output detail or not\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing the full detail of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Collection)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eCollection\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param coll  the \u003ccode\u003eCollection\u003c/code\u003e to add to the\n     *  \u003ccode\u003etoString\u003c/code\u003e, not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Map)",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eMap\u003ccode\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param map  the \u003ccode\u003eMap\u003c/code\u003e to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 481,
      "end_line": 485,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing a summary of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/P\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 46)",
        "(line 483,col 9)-(line 483,col 59)",
        "(line 484,col 9)-(line 484,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, long)",
      "begin_line": 497,
      "end_line": 501,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 44)",
        "(line 499,col 9)-(line 499,col 47)",
        "(line 500,col 9)-(line 500,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, long)",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 525,
      "end_line": 529,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 44)",
        "(line 527,col 9)-(line 527,col 47)",
        "(line 528,col 9)-(line 528,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 539,
      "end_line": 541,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, short)",
      "begin_line": 553,
      "end_line": 557,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 44)",
        "(line 555,col 9)-(line 555,col 47)",
        "(line 556,col 9)-(line 556,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, short)",
      "begin_line": 567,
      "end_line": 569,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, byte)",
      "begin_line": 581,
      "end_line": 585,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 44)",
        "(line 583,col 9)-(line 583,col 47)",
        "(line 584,col 9)-(line 584,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, byte)",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, char)",
      "begin_line": 609,
      "end_line": 613,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 44)",
        "(line 611,col 9)-(line 611,col 47)",
        "(line 612,col 9)-(line 612,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, char)",
      "begin_line": 623,
      "end_line": 625,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, double)",
      "begin_line": 637,
      "end_line": 641,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 44)",
        "(line 639,col 9)-(line 639,col 47)",
        "(line 640,col 9)-(line 640,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, double)",
      "begin_line": 651,
      "end_line": 653,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, float)",
      "begin_line": 665,
      "end_line": 669,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 44)",
        "(line 667,col 9)-(line 667,col 47)",
        "(line 668,col 9)-(line 668,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, float)",
      "begin_line": 679,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, boolean)",
      "begin_line": 693,
      "end_line": 697,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 44)",
        "(line 695,col 9)-(line 695,col 47)",
        "(line 696,col 9)-(line 696,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, boolean)",
      "begin_line": 707,
      "end_line": 709,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, java.lang.Object[], java.lang.Boolean)",
      "begin_line": 721,
      "end_line": 735,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 44)",
        "(line 724,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object[])",
      "begin_line": 748,
      "end_line": 763,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an\n     * \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 34)",
        "(line 750,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.reflectionAppendArrayDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 774,
      "end_line": 790,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an array type.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 34)",
        "(line 776,col 9)-(line 776,col 44)",
        "(line 777,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object[])",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of an\n     * \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, long[], java.lang.Boolean)",
      "begin_line": 817,
      "end_line": 831,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 44)",
        "(line 820,col 9)-(line 828,col 9)",
        "(line 830,col 9)-(line 830,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, long[])",
      "begin_line": 842,
      "end_line": 851,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 34)",
        "(line 844,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 850,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, long[])",
      "begin_line": 862,
      "end_line": 864,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, int[], java.lang.Boolean)",
      "begin_line": 878,
      "end_line": 892,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 44)",
        "(line 881,col 9)-(line 889,col 9)",
        "(line 891,col 9)-(line 891,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, int[])",
      "begin_line": 903,
      "end_line": 912,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an\n     * \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 34)",
        "(line 905,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 911,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, int[])",
      "begin_line": 923,
      "end_line": 925,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of an\n     * \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, short[], java.lang.Boolean)",
      "begin_line": 939,
      "end_line": 953,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 44)",
        "(line 942,col 9)-(line 950,col 9)",
        "(line 952,col 9)-(line 952,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, short[])",
      "begin_line": 964,
      "end_line": 973,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 34)",
        "(line 966,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 972,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, short[])",
      "begin_line": 984,
      "end_line": 986,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, byte[], java.lang.Boolean)",
      "begin_line": 1000,
      "end_line": 1014,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 44)",
        "(line 1003,col 9)-(line 1011,col 9)",
        "(line 1013,col 9)-(line 1013,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, byte[])",
      "begin_line": 1025,
      "end_line": 1034,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 34)",
        "(line 1027,col 9)-(line 1032,col 9)",
        "(line 1033,col 9)-(line 1033,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, byte[])",
      "begin_line": 1045,
      "end_line": 1047,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, char[], java.lang.Boolean)",
      "begin_line": 1061,
      "end_line": 1075,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1062,col 44)",
        "(line 1064,col 9)-(line 1072,col 9)",
        "(line 1074,col 9)-(line 1074,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, char[])",
      "begin_line": 1086,
      "end_line": 1095,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 34)",
        "(line 1088,col 9)-(line 1093,col 9)",
        "(line 1094,col 9)-(line 1094,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, char[])",
      "begin_line": 1106,
      "end_line": 1108,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, double[], java.lang.Boolean)",
      "begin_line": 1122,
      "end_line": 1136,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1123,col 9)-(line 1123,col 44)",
        "(line 1125,col 9)-(line 1133,col 9)",
        "(line 1135,col 9)-(line 1135,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, double[])",
      "begin_line": 1147,
      "end_line": 1156,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1148,col 34)",
        "(line 1149,col 9)-(line 1154,col 9)",
        "(line 1155,col 9)-(line 1155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, double[])",
      "begin_line": 1167,
      "end_line": 1169,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1168,col 9)-(line 1168,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, float[], java.lang.Boolean)",
      "begin_line": 1183,
      "end_line": 1197,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1184,col 9)-(line 1184,col 44)",
        "(line 1186,col 9)-(line 1194,col 9)",
        "(line 1196,col 9)-(line 1196,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, float[])",
      "begin_line": 1208,
      "end_line": 1217,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1209,col 9)-(line 1209,col 34)",
        "(line 1210,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1216,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, float[])",
      "begin_line": 1228,
      "end_line": 1230,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1229,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, boolean[], java.lang.Boolean)",
      "begin_line": 1244,
      "end_line": 1258,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1245,col 9)-(line 1245,col 44)",
        "(line 1247,col 9)-(line 1255,col 9)",
        "(line 1257,col 9)-(line 1257,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, boolean[])",
      "begin_line": 1269,
      "end_line": 1278,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1270,col 9)-(line 1270,col 34)",
        "(line 1271,col 9)-(line 1276,col 9)",
        "(line 1277,col 9)-(line 1277,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, boolean[])",
      "begin_line": 1289,
      "end_line": 1291,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1290,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendClassName(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 1301,
      "end_line": 1309,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the class name.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose name to output\n     ",
      "child_ranges": [
        "(line 1302,col 9)-(line 1308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendIdentityHashCode(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 1317,
      "end_line": 1322,
      "comment": "\n     * \u003cp\u003eAppend the {@link System#identityHashCode(java.lang.Object)}.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose id to output\n     ",
      "child_ranges": [
        "(line 1318,col 9)-(line 1321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendContentStart(java.lang.StringBuffer)",
      "begin_line": 1329,
      "end_line": 1331,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the content start.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1330,col 9)-(line 1330,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendContentEnd(java.lang.StringBuffer)",
      "begin_line": 1338,
      "end_line": 1340,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the content end.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1339,col 9)-(line 1339,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendNullText(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1350,
      "end_line": 1352,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an indicator for \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default indicator is \u003ccode\u003e\u0027\u0026lt;null\u0026gt;\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     ",
      "child_ranges": [
        "(line 1351,col 9)-(line 1351,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendFieldSeparator(java.lang.StringBuffer)",
      "begin_line": 1359,
      "end_line": 1361,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the field separator.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1360,col 9)-(line 1360,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendFieldStart(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1369,
      "end_line": 1374,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the field start.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     ",
      "child_ranges": [
        "(line 1370,col 9)-(line 1373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendFieldEnd(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1382,
      "end_line": 1384,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003ccode\u003e the field end.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     ",
      "child_ranges": [
        "(line 1383,col 9)-(line 1383,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummarySize(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 1401,
      "end_line": 1405,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a size summary.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe size summary is used to summarize the contents of\n     * \u003ccode\u003eCollections\u003c/code\u003e, \u003ccode\u003eMaps\u003c/code\u003e and arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output consists of a prefix, the passed in size\n     * and a suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default format is \u003ccode\u003e\u0027\u0026lt;size\u003dn\u0026gt;\u0027\u003ccode\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param size  the size to append\n     ",
      "child_ranges": [
        "(line 1402,col 9)-(line 1402,col 37)",
        "(line 1403,col 9)-(line 1403,col 28)",
        "(line 1404,col 9)-(line 1404,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isFullDetail(java.lang.Boolean)",
      "begin_line": 1421,
      "end_line": 1426,
      "comment": "\n     * \u003cp\u003eIs this field to be output in full detail.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method converts a detail request into a detail level.\n     * The calling code may request full detail (\u003ccode\u003etrue\u003c/code\u003e),\n     * but a subclass might ignore that and always return\n     * \u003ccode\u003efalse\u003c/code\u003e. The calling code may pass in\n     * \u003ccode\u003enull\u003c/code\u003e indicating that it doesn\u0027t care about\n     * the detail level. In this case the default detail level is\n     * used.\u003c/p\u003e\n     * \n     * @param fullDetailRequest  the detail level requested\n     * @return whether full detail is to be shown\n     ",
      "child_ranges": [
        "(line 1422,col 9)-(line 1424,col 9)",
        "(line 1425,col 9)-(line 1425,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getShortClassName(java.lang.Class)",
      "begin_line": 1437,
      "end_line": 1439,
      "comment": "\n     * \u003cp\u003eGets the short class name for a class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe short class name is the classname excluding\n     * the package name.\u003c/p\u003e\n     *\n     * @param cls  the \u003ccode\u003eClass\u003c/code\u003e to get the short name of\n     * @return the short name\n     ",
      "child_ranges": [
        "(line 1438,col 9)-(line 1438,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseClassName()",
      "begin_line": 1451,
      "end_line": 1453,
      "comment": "\n     * \u003cp\u003eGets whether to use the class name.\u003c/p\u003e\n     *\n     * @return the current useClassName flag\n     ",
      "child_ranges": [
        "(line 1452,col 9)-(line 1452,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseClassName(boolean)",
      "begin_line": 1460,
      "end_line": 1462,
      "comment": "\n     * \u003cp\u003eSets whether to use the class name.\u003c/p\u003e\n     *\n     * @param useClassName  the new useClassName flag\n     ",
      "child_ranges": [
        "(line 1461,col 9)-(line 1461,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseShortClassName()",
      "begin_line": 1472,
      "end_line": 1474,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1473,col 9)-(line 1473,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isShortClassName()",
      "begin_line": 1483,
      "end_line": 1485,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current shortClassName flag\n     * @deprecated Use {@link #isUseShortClassName()}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 1484,col 9)-(line 1484,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseShortClassName(boolean)",
      "begin_line": 1493,
      "end_line": 1495,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param useShortClassName  the new useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1494,col 9)-(line 1494,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setShortClassName(boolean)",
      "begin_line": 1504,
      "end_line": 1506,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param shortClassName  the new shortClassName flag\n     * @deprecated Use {@link #setUseShortClassName(boolean)}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 1505,col 9)-(line 1505,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseIdentityHashCode()",
      "begin_line": 1515,
      "end_line": 1517,
      "comment": "\n     * \u003cp\u003eGets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @return the current useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 1516,col 9)-(line 1516,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseIdentityHashCode(boolean)",
      "begin_line": 1524,
      "end_line": 1526,
      "comment": "\n     * \u003cp\u003eSets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @param useIdentityHashCode  the new useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 1525,col 9)-(line 1525,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseFieldNames()",
      "begin_line": 1535,
      "end_line": 1537,
      "comment": "\n     * \u003cp\u003eGets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @return the current useFieldNames flag\n     ",
      "child_ranges": [
        "(line 1536,col 9)-(line 1536,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseFieldNames(boolean)",
      "begin_line": 1544,
      "end_line": 1546,
      "comment": "\n     * \u003cp\u003eSets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @param useFieldNames  the new useFieldNames flag\n     ",
      "child_ranges": [
        "(line 1545,col 9)-(line 1545,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isDefaultFullDetail()",
      "begin_line": 1556,
      "end_line": 1558,
      "comment": "\n     * \u003cp\u003eGets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @return the current defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 1557,col 9)-(line 1557,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setDefaultFullDetail(boolean)",
      "begin_line": 1566,
      "end_line": 1568,
      "comment": "\n     * \u003cp\u003eSets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @param defaultFullDetail  the new defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 1567,col 9)-(line 1567,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isArrayContentDetail()",
      "begin_line": 1577,
      "end_line": 1579,
      "comment": "\n     * \u003cp\u003eGets whether to output array content detail.\u003c/p\u003e\n     *\n     * @return the current array content detail setting\n     ",
      "child_ranges": [
        "(line 1578,col 9)-(line 1578,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArrayContentDetail(boolean)",
      "begin_line": 1586,
      "end_line": 1588,
      "comment": "\n     * \u003cp\u003eSets whether to output array content detail.\u003c/p\u003e\n     *\n     * @param arrayContentDetail  the new arrayContentDetail flag\n     ",
      "child_ranges": [
        "(line 1587,col 9)-(line 1587,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getArrayStart()",
      "begin_line": 1597,
      "end_line": 1599,
      "comment": "\n     * \u003cp\u003eGets the array start text.\u003c/p\u003e\n     *\n     * @return the current array start text\n     ",
      "child_ranges": [
        "(line 1598,col 9)-(line 1598,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArrayStart(java.lang.String)",
      "begin_line": 1609,
      "end_line": 1614,
      "comment": "\n     * \u003cp\u003eSets the array start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arrayStart  the new array start text\n     ",
      "child_ranges": [
        "(line 1610,col 9)-(line 1612,col 9)",
        "(line 1613,col 9)-(line 1613,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getArrayEnd()",
      "begin_line": 1623,
      "end_line": 1625,
      "comment": "\n     * \u003cp\u003eGets the array end text.\u003c/p\u003e\n     *\n     * @return the current array end text\n     ",
      "child_ranges": [
        "(line 1624,col 9)-(line 1624,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArrayEnd(java.lang.String)",
      "begin_line": 1635,
      "end_line": 1640,
      "comment": "\n     * \u003cp\u003eSets the array end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arrayEnd  the new array end text\n     ",
      "child_ranges": [
        "(line 1636,col 9)-(line 1638,col 9)",
        "(line 1639,col 9)-(line 1639,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getArraySeparator()",
      "begin_line": 1649,
      "end_line": 1651,
      "comment": "\n     * \u003cp\u003eGets the array separator text.\u003c/p\u003e\n     *\n     * @return the current array separator text\n     ",
      "child_ranges": [
        "(line 1650,col 9)-(line 1650,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArraySeparator(java.lang.String)",
      "begin_line": 1661,
      "end_line": 1666,
      "comment": "\n     * \u003cp\u003eSets the array separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arraySeparator  the new array separator text\n     ",
      "child_ranges": [
        "(line 1662,col 9)-(line 1664,col 9)",
        "(line 1665,col 9)-(line 1665,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getContentStart()",
      "begin_line": 1675,
      "end_line": 1677,
      "comment": "\n     * \u003cp\u003eGets the content start text.\u003c/p\u003e\n     *\n     * @return the current content start text\n     ",
      "child_ranges": [
        "(line 1676,col 9)-(line 1676,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setContentStart(java.lang.String)",
      "begin_line": 1687,
      "end_line": 1692,
      "comment": "\n     * \u003cp\u003eSets the content start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param contentStart  the new content start text\n     ",
      "child_ranges": [
        "(line 1688,col 9)-(line 1690,col 9)",
        "(line 1691,col 9)-(line 1691,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getContentEnd()",
      "begin_line": 1701,
      "end_line": 1703,
      "comment": "\n     * \u003cp\u003eGets the content end text.\u003c/p\u003e\n     *\n     * @return the current content end text\n     ",
      "child_ranges": [
        "(line 1702,col 9)-(line 1702,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setContentEnd(java.lang.String)",
      "begin_line": 1713,
      "end_line": 1718,
      "comment": "\n     * \u003cp\u003eSets the content end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param contentEnd  the new content end text\n     ",
      "child_ranges": [
        "(line 1714,col 9)-(line 1716,col 9)",
        "(line 1717,col 9)-(line 1717,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getFieldNameValueSeparator()",
      "begin_line": 1727,
      "end_line": 1729,
      "comment": "\n     * \u003cp\u003eGets the field name value separator text.\u003c/p\u003e\n     *\n     * @return the current field name value separator text\n     ",
      "child_ranges": [
        "(line 1728,col 9)-(line 1728,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldNameValueSeparator(java.lang.String)",
      "begin_line": 1739,
      "end_line": 1744,
      "comment": "\n     * \u003cp\u003eSets the field name value separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param fieldNameValueSeparator  the new field name value separator text\n     ",
      "child_ranges": [
        "(line 1740,col 9)-(line 1742,col 9)",
        "(line 1743,col 9)-(line 1743,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getFieldSeparator()",
      "begin_line": 1753,
      "end_line": 1755,
      "comment": "\n     * \u003cp\u003eGets the field separator text.\u003c/p\u003e\n     *\n     * @return the current field separator text\n     ",
      "child_ranges": [
        "(line 1754,col 9)-(line 1754,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldSeparator(java.lang.String)",
      "begin_line": 1765,
      "end_line": 1770,
      "comment": "\n     * \u003cp\u003eSets the field separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param fieldSeparator  the new field separator text\n     ",
      "child_ranges": [
        "(line 1766,col 9)-(line 1768,col 9)",
        "(line 1769,col 9)-(line 1769,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isFieldSeparatorAtStart()",
      "begin_line": 1781,
      "end_line": 1783,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1782,col 9)-(line 1782,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldSeparatorAtStart(boolean)",
      "begin_line": 1792,
      "end_line": 1794,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1793,col 9)-(line 1793,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isFieldSeparatorAtEnd()",
      "begin_line": 1805,
      "end_line": 1807,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1806,col 9)-(line 1806,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldSeparatorAtEnd(boolean)",
      "begin_line": 1816,
      "end_line": 1818,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1817,col 9)-(line 1817,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getNullText()",
      "begin_line": 1827,
      "end_line": 1829,
      "comment": "\n     * \u003cp\u003eGets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * @return the current text to output when null found\n     ",
      "child_ranges": [
        "(line 1828,col 9)-(line 1828,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setNullText(java.lang.String)",
      "begin_line": 1839,
      "end_line": 1844,
      "comment": "\n     * \u003cp\u003eSets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param nullText  the new text to output when null found\n     ",
      "child_ranges": [
        "(line 1840,col 9)-(line 1842,col 9)",
        "(line 1843,col 9)-(line 1843,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSizeStartText()",
      "begin_line": 1856,
      "end_line": 1858,
      "comment": "\n     * \u003cp\u003eGets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of size text\n     ",
      "child_ranges": [
        "(line 1857,col 9)-(line 1857,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSizeStartText(java.lang.String)",
      "begin_line": 1871,
      "end_line": 1876,
      "comment": "\n     * \u003cp\u003eSets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeStartText  the new start of size text\n     ",
      "child_ranges": [
        "(line 1872,col 9)-(line 1874,col 9)",
        "(line 1875,col 9)-(line 1875,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSizeEndText()",
      "begin_line": 1888,
      "end_line": 1890,
      "comment": "\n     * \u003cp\u003eGets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of size text\n     ",
      "child_ranges": [
        "(line 1889,col 9)-(line 1889,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSizeEndText(java.lang.String)",
      "begin_line": 1903,
      "end_line": 1908,
      "comment": "\n     * \u003cp\u003eSets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeEndText  the new end of size text\n     ",
      "child_ranges": [
        "(line 1904,col 9)-(line 1906,col 9)",
        "(line 1907,col 9)-(line 1907,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSummaryObjectStartText()",
      "begin_line": 1920,
      "end_line": 1922,
      "comment": "\n     * \u003cp\u003eGets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of summary text\n     ",
      "child_ranges": [
        "(line 1921,col 9)-(line 1921,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSummaryObjectStartText(java.lang.String)",
      "begin_line": 1935,
      "end_line": 1940,
      "comment": "\n     * \u003cp\u003eSets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectStartText  the new start of summary text\n     ",
      "child_ranges": [
        "(line 1936,col 9)-(line 1938,col 9)",
        "(line 1939,col 9)-(line 1939,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSummaryObjectEndText()",
      "begin_line": 1952,
      "end_line": 1954,
      "comment": "\n     * \u003cp\u003eGets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of summary text\n     ",
      "child_ranges": [
        "(line 1953,col 9)-(line 1953,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSummaryObjectEndText(java.lang.String)",
      "begin_line": 1967,
      "end_line": 1972,
      "comment": "\n     * \u003cp\u003eSets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectEndText  the new end of summary text\n     ",
      "child_ranges": [
        "(line 1968,col 9)-(line 1970,col 9)",
        "(line 1971,col 9)-(line 1971,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 1982,
      "end_line": 2002,
      "comment": "\n     * \u003cp\u003eDefault \u003ccode\u003eToStringStyle\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.DefaultToStringStyle.DefaultToStringStyle()",
      "begin_line": 1989,
      "end_line": 1991,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 1990,col 13)-(line 1990,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.DefaultToStringStyle.readResolve()",
      "begin_line": 1998,
      "end_line": 2000,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 1999,col 13)-(line 1999,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoFieldNameToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2013,
      "end_line": 2034,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that does not print out\n     * the field names.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.NoFieldNameToStringStyle.NoFieldNameToStringStyle()",
      "begin_line": 2020,
      "end_line": 2023,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2021,col 13)-(line 2021,col 20)",
        "(line 2022,col 13)-(line 2022,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.NoFieldNameToStringStyle.readResolve()",
      "begin_line": 2030,
      "end_line": 2032,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2031,col 13)-(line 2031,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ShortPrefixToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2045,
      "end_line": 2066,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that prints out the short\n     * class name and no identity hashcode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.ShortPrefixToStringStyle.ShortPrefixToStringStyle()",
      "begin_line": 2052,
      "end_line": 2056,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2053,col 13)-(line 2053,col 20)",
        "(line 2054,col 13)-(line 2054,col 44)",
        "(line 2055,col 13)-(line 2055,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.ShortPrefixToStringStyle.readResolve()",
      "begin_line": 2062,
      "end_line": 2064,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/ode\u003e after serialization.\u003c/p\u003e\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2063,col 13)-(line 2063,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SimpleToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2075,
      "end_line": 2099,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that does not print out the\n     * classname, identity hashcode, content start or field name.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.SimpleToStringStyle()",
      "begin_line": 2082,
      "end_line": 2089,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2083,col 13)-(line 2083,col 20)",
        "(line 2084,col 13)-(line 2084,col 40)",
        "(line 2085,col 13)-(line 2085,col 47)",
        "(line 2086,col 13)-(line 2086,col 41)",
        "(line 2087,col 13)-(line 2087,col 37)",
        "(line 2088,col 13)-(line 2088,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.readResolve()",
      "begin_line": 2095,
      "end_line": 2097,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/ode\u003e after serialization.\u003c/p\u003e\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2096,col 13)-(line 2096,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiLineToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2109,
      "end_line": 2133,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that outputs on multiple lines.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle.MultiLineToStringStyle()",
      "begin_line": 2116,
      "end_line": 2122,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2117,col 13)-(line 2117,col 20)",
        "(line 2118,col 13)-(line 2118,col 38)",
        "(line 2119,col 13)-(line 2119,col 70)",
        "(line 2120,col 13)-(line 2120,col 48)",
        "(line 2121,col 13)-(line 2121,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle.readResolve()",
      "begin_line": 2129,
      "end_line": 2131,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2130,col 13)-(line 2130,col 50)"
      ]
    }
  ]
}