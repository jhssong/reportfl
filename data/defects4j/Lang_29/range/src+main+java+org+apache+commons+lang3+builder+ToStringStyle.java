{
  "filepath": "/tmp/Lang-29b/src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringStyle",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 2269,
      "comment": "\n * \u003cp\u003eControls \u003ccode\u003eString\u003c/code\u003e formatting for {@link ToStringBuilder}.\n * The main public interface is always via \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThese classes are intended to be used as \u003ccode\u003eSingletons\u003c/code\u003e.\n * There is no need to instantiate a new style each time. A program\n * will generally use one of the predefined constants on this class.\n * Alternatively, the {@link StandardToStringStyle} class can be used\n * to set the individual settings. Thus most styles can be achieved\n * without subclassing.\u003c/p\u003e\n *\n * \u003cp\u003eIf required, a subclass can override as many or as few of the\n * methods as it requires. Each object type (from \u003ccode\u003eboolean\u003c/code\u003e\n * to \u003ccode\u003elong\u003c/code\u003e to \u003ccode\u003eObject\u003c/code\u003e to \u003ccode\u003eint[]\u003c/code\u003e) has\n * its own methods to output it. Most have two versions, detail and summary.\n *\n * \u003cp\u003eFor example, the detail version of the array based methods will\n * output the whole array, whereas the summary method will just output\n * the array length.\u003c/p\u003e\n *\n * \u003cp\u003eIf you want to format the output of certain objects, such as dates, you\n * must create a subclass and override a method.\n * \u003cpre\u003e\n * public class MyStyle extends ToStringStyle {\n *   protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {\n *     if (value instanceof Date) {\n *       value \u003d new SimpleDateFormat(\"yyyy-MM-dd\").format(value);\n *     }\n *     buffer.append(value);\n *   }\n * }\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Gary Gregory\n * @author Pete Gieser\n * @author Masato Tezuka\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STYLE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The default toString style. Using the Using the \u003ccode\u003ePerson\u003c/code\u003e\n     * example from {@link ToStringBuilder}, the output would look like this:\n     *\n     * \u003cpre\u003e\n     * Person@182f0db[name\u003dJohn Doe,age\u003d33,smoker\u003dfalse]\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MULTI_LINE_STYLE"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * The multi line toString style. Using the Using the \u003ccode\u003ePerson\u003c/code\u003e\n     * example from {@link ToStringBuilder}, the output would look like this:\n     *\n     * \u003cpre\u003e\n     * Person@182f0db[\n     *   name\u003dJohn Doe\n     *   age\u003d33\n     *   smoker\u003dfalse\n     * ]\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NO_FIELD_NAMES_STYLE"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * The no field names toString style. Using the Using the\n     * \u003ccode\u003ePerson\u003c/code\u003e example from {@link ToStringBuilder}, the output\n     * would look like this:\n     *\n     * \u003cpre\u003e\n     * Person@182f0db[John Doe,33,false]\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_PREFIX_STYLE"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * The short prefix toString style. Using the \u003ccode\u003ePerson\u003c/code\u003e example\n     * from {@link ToStringBuilder}, the output would look like this:\n     *\n     * \u003cpre\u003e\n     * Person[name\u003dJohn Doe,age\u003d33,smoker\u003dfalse]\n     * \u003c/pre\u003e\n     *\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIMPLE_STYLE"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * The simple toString style. Using the Using the \u003ccode\u003ePerson\u003c/code\u003e\n     * example from {@link ToStringBuilder}, the output would look like this:\n     *\n     * \u003cpre\u003e\n     * John Doe,33,false\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "REGISTRY"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * \u003cp\u003e\n     * A registry of objects used by \u003ccode\u003ereflectionToString\u003c/code\u003e methods\n     * to detect cyclical object references and avoid infinite loops.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getRegistry()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * \u003cp\u003e\n     * Returns the registry of objects being traversed by the \u003ccode\u003ereflectionToString\u003c/code\u003e\n     * methods in the current thread.\n     * \u003c/p\u003e\n     *\n     * @return Set the registry of objects being traversed\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isRegistered(java.lang.Object)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     * Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *                  The object to lookup in the registry.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given\n     *             object.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 46)",
        "(line 162,col 9)-(line 162,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.register(java.lang.Object)",
      "begin_line": 174,
      "end_line": 182,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object. Used by the reflection methods to avoid\n     * infinite loops.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *                  The object to register.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.unregister(java.lang.Object)",
      "begin_line": 196,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *                  The object to unregister.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "useFieldNames"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": "\n     * Whether to use the field names, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useClassName"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": "\n     * Whether to use the class name, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useShortClassName"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": "\n     * Whether to use short class names, the default is \u003ccode\u003efalse\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useIdentityHashCode"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": "\n     * Whether to use the identity hash code, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contentStart"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": "\n     * The content start \u003ccode\u003e\u0027[\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contentEnd"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": "\n     * The content end \u003ccode\u003e\u0027]\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldNameValueSeparator"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": "\n     * The field name value separator \u003ccode\u003e\u0027\u003d\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparatorAtStart"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": "\n     * Whether the field separator should be added before any other fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparatorAtEnd"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": "\n     * Whether the field separator should be added after any other fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparator"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": "\n     * The field separator \u003ccode\u003e\u0027,\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayStart"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": "\n     * The array start \u003ccode\u003e\u0027{\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arraySeparator"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": "\n     * The array separator \u003ccode\u003e\u0027,\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayContentDetail"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": "\n     * The detail for array content.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayEnd"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n     * The array end \u003ccode\u003e\u0027}\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFullDetail"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": "\n     * The value to use when fullDetail is \u003ccode\u003enull\u003c/code\u003e,\n     * the default value is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nullText"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": "\n     * The \u003ccode\u003enull\u003c/code\u003e text \u003ccode\u003e\u0027\u0026lt;null\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sizeStartText"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": "\n     * The summary size text start \u003ccode\u003e\u0027\u003csize\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sizeEndText"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": "\n     * The summary size text start \u003ccode\u003e\u0027\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "summaryObjectStartText"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": "\n     * The summary object text start \u003ccode\u003e\u0027\u0026lt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "summaryObjectEndText"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": "\n     * The summary object text start \u003ccode\u003e\u0027\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.ToStringStyle()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSuper(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the superclass toString.\u003c/p\u003e\n     * \u003cp\u003eNOTE: It assumes that the toString has been created from the same ToStringStyle. \u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e \u003ccode\u003esuperToString\u003c/code\u003e is ignored.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param superToString  the \u003ccode\u003esuper.toString()\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendToString(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 344,
      "end_line": 357,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e another toString.\u003c/p\u003e\n     * \u003cp\u003eNOTE: It assumes that the toString has been created from the same ToStringStyle. \u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e \u003ccode\u003etoString\u003c/code\u003e is ignored.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param toString  the additional \u003ccode\u003etoString\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendStart(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 365,
      "end_line": 374,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the start of data indicator.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to build a \u003ccode\u003etoString\u003c/code\u003e for\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendEnd(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 383,
      "end_line": 389,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the end of data indicator.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to build a\n     *  \u003ccode\u003etoString\u003c/code\u003e for.\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 33)",
        "(line 388,col 9)-(line 388,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.removeLastFieldSeparator(java.lang.StringBuffer)",
      "begin_line": 397,
      "end_line": 412,
      "comment": "\n     * \u003cp\u003eRemove the last field separator from the buffer.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 34)",
        "(line 399,col 9)-(line 399,col 45)",
        "(line 400,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, java.lang.Object, java.lang.Boolean)",
      "begin_line": 427,
      "end_line": 438,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing the full \u003ccode\u003etoString\u003c/code\u003e of the\n     * \u003ccode\u003eObject\u003c/code\u003e passed in.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 44)",
        "(line 430,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 437,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendInternal(java.lang.StringBuffer, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 459,
      "end_line": 556,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e,\n     * correctly interpreting its type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method performs the main lookup by Class type to correctly\n     * route arrays, \u003ccode\u003eCollections\u003c/code\u003e, \u003ccode\u003eMaps\u003c/code\u003e and\n     * \u003ccode\u003eObjects\u003c/code\u003e to the appropriate method.\u003c/p\u003e\n     *\n     * \u003cp\u003eEither detail or summary views can be specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a cycle is detected, an object will be appended with the\n     * \u003ccode\u003eObject.toString()\u003c/code\u003e format.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     * @param detail  output detail or not\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 466,col 24)",
        "(line 468,col 9)-(line 555,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendCyclicObject(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 570,
      "end_line": 572,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value that has been detected to participate in a cycle. This\n     * implementation will print the standard string value of the value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     *\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 571,col 8)-(line 571,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 583,
      "end_line": 585,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing the full detail of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Collection\u003c?\u003e)",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eCollection\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param coll  the \u003ccode\u003eCollection\u003c/code\u003e to add to the\n     *  \u003ccode\u003etoString\u003c/code\u003e, not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Map\u003c?, ?\u003e)",
      "begin_line": 607,
      "end_line": 609,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eMap\u003ccode\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param map  the \u003ccode\u003eMap\u003c/code\u003e to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 620,
      "end_line": 624,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing a summary of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/P\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 46)",
        "(line 622,col 9)-(line 622,col 59)",
        "(line 623,col 9)-(line 623,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, long)",
      "begin_line": 636,
      "end_line": 640,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 44)",
        "(line 638,col 9)-(line 638,col 47)",
        "(line 639,col 9)-(line 639,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, long)",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 664,
      "end_line": 668,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 44)",
        "(line 666,col 9)-(line 666,col 47)",
        "(line 667,col 9)-(line 667,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 678,
      "end_line": 680,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, short)",
      "begin_line": 692,
      "end_line": 696,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 44)",
        "(line 694,col 9)-(line 694,col 47)",
        "(line 695,col 9)-(line 695,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, short)",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, byte)",
      "begin_line": 720,
      "end_line": 724,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 44)",
        "(line 722,col 9)-(line 722,col 47)",
        "(line 723,col 9)-(line 723,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, byte)",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, char)",
      "begin_line": 748,
      "end_line": 752,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 44)",
        "(line 750,col 9)-(line 750,col 47)",
        "(line 751,col 9)-(line 751,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, char)",
      "begin_line": 762,
      "end_line": 764,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, double)",
      "begin_line": 776,
      "end_line": 780,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 44)",
        "(line 778,col 9)-(line 778,col 47)",
        "(line 779,col 9)-(line 779,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, double)",
      "begin_line": 790,
      "end_line": 792,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, float)",
      "begin_line": 804,
      "end_line": 808,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 44)",
        "(line 806,col 9)-(line 806,col 47)",
        "(line 807,col 9)-(line 807,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, float)",
      "begin_line": 818,
      "end_line": 820,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, boolean)",
      "begin_line": 832,
      "end_line": 836,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 44)",
        "(line 834,col 9)-(line 834,col 47)",
        "(line 835,col 9)-(line 835,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, boolean)",
      "begin_line": 846,
      "end_line": 848,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, java.lang.Object[], java.lang.Boolean)",
      "begin_line": 860,
      "end_line": 874,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 861,col 9)-(line 861,col 44)",
        "(line 863,col 9)-(line 871,col 9)",
        "(line 873,col 9)-(line 873,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object[])",
      "begin_line": 887,
      "end_line": 902,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an\n     * \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 34)",
        "(line 889,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 901,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 913,
      "end_line": 929,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an array type.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 34)",
        "(line 915,col 9)-(line 915,col 44)",
        "(line 916,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 928,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object[])",
      "begin_line": 940,
      "end_line": 942,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of an\n     * \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, long[], java.lang.Boolean)",
      "begin_line": 956,
      "end_line": 970,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 44)",
        "(line 959,col 9)-(line 967,col 9)",
        "(line 969,col 9)-(line 969,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, long[])",
      "begin_line": 981,
      "end_line": 990,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 34)",
        "(line 983,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 989,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, long[])",
      "begin_line": 1001,
      "end_line": 1003,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, int[], java.lang.Boolean)",
      "begin_line": 1017,
      "end_line": 1031,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 44)",
        "(line 1020,col 9)-(line 1028,col 9)",
        "(line 1030,col 9)-(line 1030,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, int[])",
      "begin_line": 1042,
      "end_line": 1051,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an\n     * \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 34)",
        "(line 1044,col 9)-(line 1049,col 9)",
        "(line 1050,col 9)-(line 1050,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, int[])",
      "begin_line": 1062,
      "end_line": 1064,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of an\n     * \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1063,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, short[], java.lang.Boolean)",
      "begin_line": 1078,
      "end_line": 1092,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1079,col 44)",
        "(line 1081,col 9)-(line 1089,col 9)",
        "(line 1091,col 9)-(line 1091,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, short[])",
      "begin_line": 1103,
      "end_line": 1112,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 34)",
        "(line 1105,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, short[])",
      "begin_line": 1123,
      "end_line": 1125,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, byte[], java.lang.Boolean)",
      "begin_line": 1139,
      "end_line": 1153,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 44)",
        "(line 1142,col 9)-(line 1150,col 9)",
        "(line 1152,col 9)-(line 1152,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, byte[])",
      "begin_line": 1164,
      "end_line": 1173,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1165,col 9)-(line 1165,col 34)",
        "(line 1166,col 9)-(line 1171,col 9)",
        "(line 1172,col 9)-(line 1172,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, byte[])",
      "begin_line": 1184,
      "end_line": 1186,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, char[], java.lang.Boolean)",
      "begin_line": 1200,
      "end_line": 1214,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1201,col 9)-(line 1201,col 44)",
        "(line 1203,col 9)-(line 1211,col 9)",
        "(line 1213,col 9)-(line 1213,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, char[])",
      "begin_line": 1225,
      "end_line": 1234,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1226,col 9)-(line 1226,col 34)",
        "(line 1227,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1233,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, char[])",
      "begin_line": 1245,
      "end_line": 1247,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1246,col 9)-(line 1246,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, double[], java.lang.Boolean)",
      "begin_line": 1261,
      "end_line": 1275,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1262,col 9)-(line 1262,col 44)",
        "(line 1264,col 9)-(line 1272,col 9)",
        "(line 1274,col 9)-(line 1274,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, double[])",
      "begin_line": 1286,
      "end_line": 1295,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1287,col 34)",
        "(line 1288,col 9)-(line 1293,col 9)",
        "(line 1294,col 9)-(line 1294,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, double[])",
      "begin_line": 1306,
      "end_line": 1308,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, float[], java.lang.Boolean)",
      "begin_line": 1322,
      "end_line": 1336,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1323,col 9)-(line 1323,col 44)",
        "(line 1325,col 9)-(line 1333,col 9)",
        "(line 1335,col 9)-(line 1335,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, float[])",
      "begin_line": 1347,
      "end_line": 1356,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1348,col 9)-(line 1348,col 34)",
        "(line 1349,col 9)-(line 1354,col 9)",
        "(line 1355,col 9)-(line 1355,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, float[])",
      "begin_line": 1367,
      "end_line": 1369,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1368,col 9)-(line 1368,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, boolean[], java.lang.Boolean)",
      "begin_line": 1383,
      "end_line": 1397,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1384,col 9)-(line 1384,col 44)",
        "(line 1386,col 9)-(line 1394,col 9)",
        "(line 1396,col 9)-(line 1396,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, boolean[])",
      "begin_line": 1408,
      "end_line": 1417,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1409,col 9)-(line 1409,col 34)",
        "(line 1410,col 9)-(line 1415,col 9)",
        "(line 1416,col 9)-(line 1416,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, boolean[])",
      "begin_line": 1428,
      "end_line": 1430,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1429,col 9)-(line 1429,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendClassName(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 1440,
      "end_line": 1449,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the class name.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose name to output\n     ",
      "child_ranges": [
        "(line 1441,col 9)-(line 1448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendIdentityHashCode(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 1457,
      "end_line": 1463,
      "comment": "\n     * \u003cp\u003eAppend the {@link System#identityHashCode(java.lang.Object)}.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose id to output\n     ",
      "child_ranges": [
        "(line 1458,col 9)-(line 1462,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendContentStart(java.lang.StringBuffer)",
      "begin_line": 1470,
      "end_line": 1472,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the content start.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1471,col 9)-(line 1471,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendContentEnd(java.lang.StringBuffer)",
      "begin_line": 1479,
      "end_line": 1481,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the content end.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1480,col 9)-(line 1480,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendNullText(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1491,
      "end_line": 1493,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an indicator for \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default indicator is \u003ccode\u003e\u0027\u0026lt;null\u0026gt;\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     ",
      "child_ranges": [
        "(line 1492,col 9)-(line 1492,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendFieldSeparator(java.lang.StringBuffer)",
      "begin_line": 1500,
      "end_line": 1502,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the field separator.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1501,col 9)-(line 1501,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendFieldStart(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1510,
      "end_line": 1515,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the field start.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     ",
      "child_ranges": [
        "(line 1511,col 9)-(line 1514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendFieldEnd(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1523,
      "end_line": 1525,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003ccode\u003e the field end.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     ",
      "child_ranges": [
        "(line 1524,col 9)-(line 1524,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummarySize(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 1542,
      "end_line": 1546,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a size summary.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe size summary is used to summarize the contents of\n     * \u003ccode\u003eCollections\u003c/code\u003e, \u003ccode\u003eMaps\u003c/code\u003e and arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output consists of a prefix, the passed in size\n     * and a suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default format is \u003ccode\u003e\u0027\u0026lt;size\u003dn\u0026gt;\u0027\u003ccode\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param size  the size to append\n     ",
      "child_ranges": [
        "(line 1543,col 9)-(line 1543,col 37)",
        "(line 1544,col 9)-(line 1544,col 28)",
        "(line 1545,col 9)-(line 1545,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isFullDetail(java.lang.Boolean)",
      "begin_line": 1562,
      "end_line": 1567,
      "comment": "\n     * \u003cp\u003eIs this field to be output in full detail.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method converts a detail request into a detail level.\n     * The calling code may request full detail (\u003ccode\u003etrue\u003c/code\u003e),\n     * but a subclass might ignore that and always return\n     * \u003ccode\u003efalse\u003c/code\u003e. The calling code may pass in\n     * \u003ccode\u003enull\u003c/code\u003e indicating that it doesn\u0027t care about\n     * the detail level. In this case the default detail level is\n     * used.\u003c/p\u003e\n     *\n     * @param fullDetailRequest  the detail level requested\n     * @return whether full detail is to be shown\n     ",
      "child_ranges": [
        "(line 1563,col 9)-(line 1565,col 9)",
        "(line 1566,col 9)-(line 1566,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getShortClassName(java.lang.Class\u003c?\u003e)",
      "begin_line": 1578,
      "end_line": 1580,
      "comment": "\n     * \u003cp\u003eGets the short class name for a class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe short class name is the classname excluding\n     * the package name.\u003c/p\u003e\n     *\n     * @param cls  the \u003ccode\u003eClass\u003c/code\u003e to get the short name of\n     * @return the short name\n     ",
      "child_ranges": [
        "(line 1579,col 9)-(line 1579,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isUseClassName()",
      "begin_line": 1592,
      "end_line": 1594,
      "comment": "\n     * \u003cp\u003eGets whether to use the class name.\u003c/p\u003e\n     *\n     * @return the current useClassName flag\n     ",
      "child_ranges": [
        "(line 1593,col 9)-(line 1593,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setUseClassName(boolean)",
      "begin_line": 1601,
      "end_line": 1603,
      "comment": "\n     * \u003cp\u003eSets whether to use the class name.\u003c/p\u003e\n     *\n     * @param useClassName  the new useClassName flag\n     ",
      "child_ranges": [
        "(line 1602,col 9)-(line 1602,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isUseShortClassName()",
      "begin_line": 1613,
      "end_line": 1615,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1614,col 9)-(line 1614,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setUseShortClassName(boolean)",
      "begin_line": 1623,
      "end_line": 1625,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param useShortClassName  the new useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1624,col 9)-(line 1624,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isUseIdentityHashCode()",
      "begin_line": 1634,
      "end_line": 1636,
      "comment": "\n     * \u003cp\u003eGets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @return the current useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 1635,col 9)-(line 1635,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setUseIdentityHashCode(boolean)",
      "begin_line": 1643,
      "end_line": 1645,
      "comment": "\n     * \u003cp\u003eSets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @param useIdentityHashCode  the new useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 1644,col 9)-(line 1644,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isUseFieldNames()",
      "begin_line": 1654,
      "end_line": 1656,
      "comment": "\n     * \u003cp\u003eGets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @return the current useFieldNames flag\n     ",
      "child_ranges": [
        "(line 1655,col 9)-(line 1655,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setUseFieldNames(boolean)",
      "begin_line": 1663,
      "end_line": 1665,
      "comment": "\n     * \u003cp\u003eSets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @param useFieldNames  the new useFieldNames flag\n     ",
      "child_ranges": [
        "(line 1664,col 9)-(line 1664,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isDefaultFullDetail()",
      "begin_line": 1675,
      "end_line": 1677,
      "comment": "\n     * \u003cp\u003eGets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @return the current defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 1676,col 9)-(line 1676,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setDefaultFullDetail(boolean)",
      "begin_line": 1685,
      "end_line": 1687,
      "comment": "\n     * \u003cp\u003eSets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @param defaultFullDetail  the new defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 1686,col 9)-(line 1686,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isArrayContentDetail()",
      "begin_line": 1696,
      "end_line": 1698,
      "comment": "\n     * \u003cp\u003eGets whether to output array content detail.\u003c/p\u003e\n     *\n     * @return the current array content detail setting\n     ",
      "child_ranges": [
        "(line 1697,col 9)-(line 1697,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setArrayContentDetail(boolean)",
      "begin_line": 1705,
      "end_line": 1707,
      "comment": "\n     * \u003cp\u003eSets whether to output array content detail.\u003c/p\u003e\n     *\n     * @param arrayContentDetail  the new arrayContentDetail flag\n     ",
      "child_ranges": [
        "(line 1706,col 9)-(line 1706,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getArrayStart()",
      "begin_line": 1716,
      "end_line": 1718,
      "comment": "\n     * \u003cp\u003eGets the array start text.\u003c/p\u003e\n     *\n     * @return the current array start text\n     ",
      "child_ranges": [
        "(line 1717,col 9)-(line 1717,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setArrayStart(java.lang.String)",
      "begin_line": 1728,
      "end_line": 1733,
      "comment": "\n     * \u003cp\u003eSets the array start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arrayStart  the new array start text\n     ",
      "child_ranges": [
        "(line 1729,col 9)-(line 1731,col 9)",
        "(line 1732,col 9)-(line 1732,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getArrayEnd()",
      "begin_line": 1742,
      "end_line": 1744,
      "comment": "\n     * \u003cp\u003eGets the array end text.\u003c/p\u003e\n     *\n     * @return the current array end text\n     ",
      "child_ranges": [
        "(line 1743,col 9)-(line 1743,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setArrayEnd(java.lang.String)",
      "begin_line": 1754,
      "end_line": 1759,
      "comment": "\n     * \u003cp\u003eSets the array end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arrayEnd  the new array end text\n     ",
      "child_ranges": [
        "(line 1755,col 9)-(line 1757,col 9)",
        "(line 1758,col 9)-(line 1758,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getArraySeparator()",
      "begin_line": 1768,
      "end_line": 1770,
      "comment": "\n     * \u003cp\u003eGets the array separator text.\u003c/p\u003e\n     *\n     * @return the current array separator text\n     ",
      "child_ranges": [
        "(line 1769,col 9)-(line 1769,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setArraySeparator(java.lang.String)",
      "begin_line": 1780,
      "end_line": 1785,
      "comment": "\n     * \u003cp\u003eSets the array separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arraySeparator  the new array separator text\n     ",
      "child_ranges": [
        "(line 1781,col 9)-(line 1783,col 9)",
        "(line 1784,col 9)-(line 1784,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getContentStart()",
      "begin_line": 1794,
      "end_line": 1796,
      "comment": "\n     * \u003cp\u003eGets the content start text.\u003c/p\u003e\n     *\n     * @return the current content start text\n     ",
      "child_ranges": [
        "(line 1795,col 9)-(line 1795,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setContentStart(java.lang.String)",
      "begin_line": 1806,
      "end_line": 1811,
      "comment": "\n     * \u003cp\u003eSets the content start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param contentStart  the new content start text\n     ",
      "child_ranges": [
        "(line 1807,col 9)-(line 1809,col 9)",
        "(line 1810,col 9)-(line 1810,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getContentEnd()",
      "begin_line": 1820,
      "end_line": 1822,
      "comment": "\n     * \u003cp\u003eGets the content end text.\u003c/p\u003e\n     *\n     * @return the current content end text\n     ",
      "child_ranges": [
        "(line 1821,col 9)-(line 1821,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setContentEnd(java.lang.String)",
      "begin_line": 1832,
      "end_line": 1837,
      "comment": "\n     * \u003cp\u003eSets the content end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param contentEnd  the new content end text\n     ",
      "child_ranges": [
        "(line 1833,col 9)-(line 1835,col 9)",
        "(line 1836,col 9)-(line 1836,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getFieldNameValueSeparator()",
      "begin_line": 1846,
      "end_line": 1848,
      "comment": "\n     * \u003cp\u003eGets the field name value separator text.\u003c/p\u003e\n     *\n     * @return the current field name value separator text\n     ",
      "child_ranges": [
        "(line 1847,col 9)-(line 1847,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setFieldNameValueSeparator(java.lang.String)",
      "begin_line": 1858,
      "end_line": 1863,
      "comment": "\n     * \u003cp\u003eSets the field name value separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param fieldNameValueSeparator  the new field name value separator text\n     ",
      "child_ranges": [
        "(line 1859,col 9)-(line 1861,col 9)",
        "(line 1862,col 9)-(line 1862,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getFieldSeparator()",
      "begin_line": 1872,
      "end_line": 1874,
      "comment": "\n     * \u003cp\u003eGets the field separator text.\u003c/p\u003e\n     *\n     * @return the current field separator text\n     ",
      "child_ranges": [
        "(line 1873,col 9)-(line 1873,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setFieldSeparator(java.lang.String)",
      "begin_line": 1884,
      "end_line": 1889,
      "comment": "\n     * \u003cp\u003eSets the field separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param fieldSeparator  the new field separator text\n     ",
      "child_ranges": [
        "(line 1885,col 9)-(line 1887,col 9)",
        "(line 1888,col 9)-(line 1888,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isFieldSeparatorAtStart()",
      "begin_line": 1900,
      "end_line": 1902,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the start\n     * of each buffer.\u003c/p\u003e\n     *\n     * @return the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1901,col 9)-(line 1901,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setFieldSeparatorAtStart(boolean)",
      "begin_line": 1911,
      "end_line": 1913,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the start\n     * of each buffer.\u003c/p\u003e\n     *\n     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1912,col 9)-(line 1912,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isFieldSeparatorAtEnd()",
      "begin_line": 1924,
      "end_line": 1926,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the end\n     * of each buffer.\u003c/p\u003e\n     *\n     * @return fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1925,col 9)-(line 1925,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setFieldSeparatorAtEnd(boolean)",
      "begin_line": 1935,
      "end_line": 1937,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the end\n     * of each buffer.\u003c/p\u003e\n     *\n     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1936,col 9)-(line 1936,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getNullText()",
      "begin_line": 1946,
      "end_line": 1948,
      "comment": "\n     * \u003cp\u003eGets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * @return the current text to output when null found\n     ",
      "child_ranges": [
        "(line 1947,col 9)-(line 1947,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setNullText(java.lang.String)",
      "begin_line": 1958,
      "end_line": 1963,
      "comment": "\n     * \u003cp\u003eSets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param nullText  the new text to output when null found\n     ",
      "child_ranges": [
        "(line 1959,col 9)-(line 1961,col 9)",
        "(line 1962,col 9)-(line 1962,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getSizeStartText()",
      "begin_line": 1975,
      "end_line": 1977,
      "comment": "\n     * \u003cp\u003eGets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of size text\n     ",
      "child_ranges": [
        "(line 1976,col 9)-(line 1976,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setSizeStartText(java.lang.String)",
      "begin_line": 1990,
      "end_line": 1995,
      "comment": "\n     * \u003cp\u003eSets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeStartText  the new start of size text\n     ",
      "child_ranges": [
        "(line 1991,col 9)-(line 1993,col 9)",
        "(line 1994,col 9)-(line 1994,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getSizeEndText()",
      "begin_line": 2007,
      "end_line": 2009,
      "comment": "\n     * \u003cp\u003eGets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of size text\n     ",
      "child_ranges": [
        "(line 2008,col 9)-(line 2008,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setSizeEndText(java.lang.String)",
      "begin_line": 2022,
      "end_line": 2027,
      "comment": "\n     * \u003cp\u003eSets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeEndText  the new end of size text\n     ",
      "child_ranges": [
        "(line 2023,col 9)-(line 2025,col 9)",
        "(line 2026,col 9)-(line 2026,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getSummaryObjectStartText()",
      "begin_line": 2039,
      "end_line": 2041,
      "comment": "\n     * \u003cp\u003eGets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of summary text\n     ",
      "child_ranges": [
        "(line 2040,col 9)-(line 2040,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setSummaryObjectStartText(java.lang.String)",
      "begin_line": 2054,
      "end_line": 2059,
      "comment": "\n     * \u003cp\u003eSets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectStartText  the new start of summary text\n     ",
      "child_ranges": [
        "(line 2055,col 9)-(line 2057,col 9)",
        "(line 2058,col 9)-(line 2058,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getSummaryObjectEndText()",
      "begin_line": 2071,
      "end_line": 2073,
      "comment": "\n     * \u003cp\u003eGets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of summary text\n     ",
      "child_ranges": [
        "(line 2072,col 9)-(line 2072,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setSummaryObjectEndText(java.lang.String)",
      "begin_line": 2086,
      "end_line": 2091,
      "comment": "\n     * \u003cp\u003eSets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectEndText  the new end of summary text\n     ",
      "child_ranges": [
        "(line 2087,col 9)-(line 2089,col 9)",
        "(line 2090,col 9)-(line 2090,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 2101,
      "end_line": 2128,
      "comment": "\n     * \u003cp\u003eDefault \u003ccode\u003eToStringStyle\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2108,
      "end_line": 2108,
      "comment": "\n         * Required for serialization support.\n         *\n         * @see java.io.Serializable\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.DefaultToStringStyle.DefaultToStringStyle()",
      "begin_line": 2115,
      "end_line": 2117,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2116,col 13)-(line 2116,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.DefaultToStringStyle.readResolve()",
      "begin_line": 2124,
      "end_line": 2126,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2125,col 13)-(line 2125,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoFieldNameToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 2139,
      "end_line": 2162,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that does not print out\n     * the field names.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2141,
      "end_line": 2141,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.NoFieldNameToStringStyle.NoFieldNameToStringStyle()",
      "begin_line": 2148,
      "end_line": 2151,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2149,col 13)-(line 2149,col 20)",
        "(line 2150,col 13)-(line 2150,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.NoFieldNameToStringStyle.readResolve()",
      "begin_line": 2158,
      "end_line": 2160,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2159,col 13)-(line 2159,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ShortPrefixToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 2173,
      "end_line": 2196,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that prints out the short\n     * class name and no identity hashcode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2175,
      "end_line": 2175,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.ShortPrefixToStringStyle.ShortPrefixToStringStyle()",
      "begin_line": 2182,
      "end_line": 2186,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2183,col 13)-(line 2183,col 20)",
        "(line 2184,col 13)-(line 2184,col 44)",
        "(line 2185,col 13)-(line 2185,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.ShortPrefixToStringStyle.readResolve()",
      "begin_line": 2192,
      "end_line": 2194,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/ode\u003e after serialization.\u003c/p\u003e\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2193,col 13)-(line 2193,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SimpleToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 2205,
      "end_line": 2231,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that does not print out the\n     * classname, identity hashcode, content start or field name.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2207,
      "end_line": 2207,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.SimpleToStringStyle.SimpleToStringStyle()",
      "begin_line": 2214,
      "end_line": 2221,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2215,col 13)-(line 2215,col 20)",
        "(line 2216,col 13)-(line 2216,col 40)",
        "(line 2217,col 13)-(line 2217,col 47)",
        "(line 2218,col 13)-(line 2218,col 41)",
        "(line 2219,col 13)-(line 2219,col 37)",
        "(line 2220,col 13)-(line 2220,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.SimpleToStringStyle.readResolve()",
      "begin_line": 2227,
      "end_line": 2229,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/ode\u003e after serialization.\u003c/p\u003e\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2228,col 13)-(line 2228,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiLineToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 2241,
      "end_line": 2267,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that outputs on multiple lines.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2243,
      "end_line": 2243,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.MultiLineToStringStyle.MultiLineToStringStyle()",
      "begin_line": 2250,
      "end_line": 2256,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2251,col 13)-(line 2251,col 20)",
        "(line 2252,col 13)-(line 2252,col 38)",
        "(line 2253,col 13)-(line 2253,col 70)",
        "(line 2254,col 13)-(line 2254,col 48)",
        "(line 2255,col 13)-(line 2255,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.MultiLineToStringStyle.readResolve()",
      "begin_line": 2263,
      "end_line": 2265,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2264,col 13)-(line 2264,col 50)"
      ]
    }
  ]
}