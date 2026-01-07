{
  "filepath": "/tmp/Lang-8b/src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringStyle",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 2280,
      "comment": "\n * \u003cp\u003eControls \u003ccode\u003eString\u003c/code\u003e formatting for {@link ToStringBuilder}.\n * The main public interface is always via \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThese classes are intended to be used as \u003ccode\u003eSingletons\u003c/code\u003e.\n * There is no need to instantiate a new style each time. A program\n * will generally use one of the predefined constants on this class.\n * Alternatively, the {@link StandardToStringStyle} class can be used\n * to set the individual settings. Thus most styles can be achieved\n * without subclassing.\u003c/p\u003e\n *\n * \u003cp\u003eIf required, a subclass can override as many or as few of the\n * methods as it requires. Each object type (from \u003ccode\u003eboolean\u003c/code\u003e\n * to \u003ccode\u003elong\u003c/code\u003e to \u003ccode\u003eObject\u003c/code\u003e to \u003ccode\u003eint[]\u003c/code\u003e) has\n * its own methods to output it. Most have two versions, detail and summary.\n *\n * \u003cp\u003eFor example, the detail version of the array based methods will\n * output the whole array, whereas the summary method will just output\n * the array length.\u003c/p\u003e\n *\n * \u003cp\u003eIf you want to format the output of certain objects, such as dates, you\n * must create a subclass and override a method.\n * \u003cpre\u003e\n * public class MyStyle extends ToStringStyle {\n *   protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {\n *     if (value instanceof Date) {\n *       value \u003d new SimpleDateFormat(\"yyyy-MM-dd\").format(value);\n *     }\n *     buffer.append(value);\n *   }\n * }\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Serialization version ID.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STYLE"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * The default toString style. Using the Using the \u003ccode\u003ePerson\u003c/code\u003e\n     * example from {@link ToStringBuilder}, the output would look like this:\n     *\n     * \u003cpre\u003e\n     * Person@182f0db[name\u003dJohn Doe,age\u003d33,smoker\u003dfalse]\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MULTI_LINE_STYLE"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * The multi line toString style. Using the Using the \u003ccode\u003ePerson\u003c/code\u003e\n     * example from {@link ToStringBuilder}, the output would look like this:\n     *\n     * \u003cpre\u003e\n     * Person@182f0db[\n     *   name\u003dJohn Doe\n     *   age\u003d33\n     *   smoker\u003dfalse\n     * ]\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NO_FIELD_NAMES_STYLE"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * The no field names toString style. Using the Using the\n     * \u003ccode\u003ePerson\u003c/code\u003e example from {@link ToStringBuilder}, the output\n     * would look like this:\n     *\n     * \u003cpre\u003e\n     * Person@182f0db[John Doe,33,false]\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_PREFIX_STYLE"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * The short prefix toString style. Using the \u003ccode\u003ePerson\u003c/code\u003e example\n     * from {@link ToStringBuilder}, the output would look like this:\n     *\n     * \u003cpre\u003e\n     * Person[name\u003dJohn Doe,age\u003d33,smoker\u003dfalse]\n     * \u003c/pre\u003e\n     *\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIMPLE_STYLE"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * The simple toString style. Using the Using the \u003ccode\u003ePerson\u003c/code\u003e\n     * example from {@link ToStringBuilder}, the output would look like this:\n     *\n     * \u003cpre\u003e\n     * John Doe,33,false\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "REGISTRY"
      ],
      "begin_line": 136,
      "end_line": 137,
      "comment": "\n     * \u003cp\u003e\n     * A registry of objects used by \u003ccode\u003ereflectionToString\u003c/code\u003e methods\n     * to detect cyclical object references and avoid infinite loops.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getRegistry()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * \u003cp\u003e\n     * Returns the registry of objects being traversed by the \u003ccode\u003ereflectionToString\u003c/code\u003e\n     * methods in the current thread.\n     * \u003c/p\u003e\n     *\n     * @return Set the registry of objects being traversed\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isRegistered(java.lang.Object)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     * Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *                  The object to lookup in the registry.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given\n     *             object.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 173,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.register(java.lang.Object)",
      "begin_line": 185,
      "end_line": 193,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object. Used by the reflection methods to avoid\n     * infinite loops.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *                  The object to register.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.unregister(java.lang.Object)",
      "begin_line": 207,
      "end_line": 217,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *                  The object to unregister.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "useFieldNames"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": "\n     * Whether to use the field names, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useClassName"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": "\n     * Whether to use the class name, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useShortClassName"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": "\n     * Whether to use short class names, the default is \u003ccode\u003efalse\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useIdentityHashCode"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": "\n     * Whether to use the identity hash code, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contentStart"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": "\n     * The content start \u003ccode\u003e\u0027[\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contentEnd"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": "\n     * The content end \u003ccode\u003e\u0027]\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldNameValueSeparator"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": "\n     * The field name value separator \u003ccode\u003e\u0027\u003d\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparatorAtStart"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": "\n     * Whether the field separator should be added before any other fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparatorAtEnd"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": "\n     * Whether the field separator should be added after any other fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparator"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": "\n     * The field separator \u003ccode\u003e\u0027,\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayStart"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": "\n     * The array start \u003ccode\u003e\u0027{\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arraySeparator"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": "\n     * The array separator \u003ccode\u003e\u0027,\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayContentDetail"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": "\n     * The detail for array content.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayEnd"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": "\n     * The array end \u003ccode\u003e\u0027}\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFullDetail"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": "\n     * The value to use when fullDetail is \u003ccode\u003enull\u003c/code\u003e,\n     * the default value is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nullText"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": "\n     * The \u003ccode\u003enull\u003c/code\u003e text \u003ccode\u003e\u0027\u0026lt;null\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sizeStartText"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": "\n     * The summary size text start \u003ccode\u003e\u0027\u003csize\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sizeEndText"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": "\n     * The summary size text start \u003ccode\u003e\u0027\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "summaryObjectStartText"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": "\n     * The summary object text start \u003ccode\u003e\u0027\u0026lt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "summaryObjectEndText"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": "\n     * The summary object text start \u003ccode\u003e\u0027\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.ToStringStyle()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSuper(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the superclass toString.\u003c/p\u003e\n     * \u003cp\u003eNOTE: It assumes that the toString has been created from the same ToStringStyle. \u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e \u003ccode\u003esuperToString\u003c/code\u003e is ignored.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param superToString  the \u003ccode\u003esuper.toString()\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendToString(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 355,
      "end_line": 368,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e another toString.\u003c/p\u003e\n     * \u003cp\u003eNOTE: It assumes that the toString has been created from the same ToStringStyle. \u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e \u003ccode\u003etoString\u003c/code\u003e is ignored.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param toString  the additional \u003ccode\u003etoString\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendStart(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 376,
      "end_line": 385,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the start of data indicator.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to build a \u003ccode\u003etoString\u003c/code\u003e for\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendEnd(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 394,
      "end_line": 400,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the end of data indicator.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to build a\n     *  \u003ccode\u003etoString\u003c/code\u003e for.\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 33)",
        "(line 399,col 9)-(line 399,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.removeLastFieldSeparator(java.lang.StringBuffer)",
      "begin_line": 408,
      "end_line": 423,
      "comment": "\n     * \u003cp\u003eRemove the last field separator from the buffer.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 34)",
        "(line 410,col 9)-(line 410,col 45)",
        "(line 411,col 9)-(line 422,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, java.lang.Object, java.lang.Boolean)",
      "begin_line": 438,
      "end_line": 449,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing the full \u003ccode\u003etoString\u003c/code\u003e of the\n     * \u003ccode\u003eObject\u003c/code\u003e passed in.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 44)",
        "(line 441,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 448,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendInternal(java.lang.StringBuffer, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 470,
      "end_line": 567,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e,\n     * correctly interpreting its type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method performs the main lookup by Class type to correctly\n     * route arrays, \u003ccode\u003eCollections\u003c/code\u003e, \u003ccode\u003eMaps\u003c/code\u003e and\n     * \u003ccode\u003eObjects\u003c/code\u003e to the appropriate method.\u003c/p\u003e\n     *\n     * \u003cp\u003eEither detail or summary views can be specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a cycle is detected, an object will be appended with the\n     * \u003ccode\u003eObject.toString()\u003c/code\u003e format.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     * @param detail  output detail or not\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 477,col 24)",
        "(line 479,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendCyclicObject(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value that has been detected to participate in a cycle. This\n     * implementation will print the standard string value of the value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     *\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 582,col 8)-(line 582,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 594,
      "end_line": 596,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing the full detail of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Collection\u003c?\u003e)",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eCollection\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param coll  the \u003ccode\u003eCollection\u003c/code\u003e to add to the\n     *  \u003ccode\u003etoString\u003c/code\u003e, not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Map\u003c?, ?\u003e)",
      "begin_line": 618,
      "end_line": 620,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eMap\u003ccode\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param map  the \u003ccode\u003eMap\u003c/code\u003e to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 631,
      "end_line": 635,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing a summary of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/P\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 46)",
        "(line 633,col 9)-(line 633,col 59)",
        "(line 634,col 9)-(line 634,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, long)",
      "begin_line": 647,
      "end_line": 651,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 44)",
        "(line 649,col 9)-(line 649,col 47)",
        "(line 650,col 9)-(line 650,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, long)",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 675,
      "end_line": 679,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 44)",
        "(line 677,col 9)-(line 677,col 47)",
        "(line 678,col 9)-(line 678,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, short)",
      "begin_line": 703,
      "end_line": 707,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 44)",
        "(line 705,col 9)-(line 705,col 47)",
        "(line 706,col 9)-(line 706,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, short)",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, byte)",
      "begin_line": 731,
      "end_line": 735,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 44)",
        "(line 733,col 9)-(line 733,col 47)",
        "(line 734,col 9)-(line 734,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, byte)",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, char)",
      "begin_line": 759,
      "end_line": 763,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 44)",
        "(line 761,col 9)-(line 761,col 47)",
        "(line 762,col 9)-(line 762,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, char)",
      "begin_line": 773,
      "end_line": 775,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 774,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, double)",
      "begin_line": 787,
      "end_line": 791,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 44)",
        "(line 789,col 9)-(line 789,col 47)",
        "(line 790,col 9)-(line 790,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, double)",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, float)",
      "begin_line": 815,
      "end_line": 819,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 44)",
        "(line 817,col 9)-(line 817,col 47)",
        "(line 818,col 9)-(line 818,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, float)",
      "begin_line": 829,
      "end_line": 831,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, boolean)",
      "begin_line": 843,
      "end_line": 847,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 44)",
        "(line 845,col 9)-(line 845,col 47)",
        "(line 846,col 9)-(line 846,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, boolean)",
      "begin_line": 857,
      "end_line": 859,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 858,col 9)-(line 858,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, java.lang.Object[], java.lang.Boolean)",
      "begin_line": 871,
      "end_line": 885,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 44)",
        "(line 874,col 9)-(line 882,col 9)",
        "(line 884,col 9)-(line 884,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object[])",
      "begin_line": 898,
      "end_line": 913,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an\n     * \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 34)",
        "(line 900,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.reflectionAppendArrayDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 924,
      "end_line": 940,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an array type.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 34)",
        "(line 926,col 9)-(line 926,col 44)",
        "(line 927,col 9)-(line 938,col 9)",
        "(line 939,col 9)-(line 939,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object[])",
      "begin_line": 951,
      "end_line": 953,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of an\n     * \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, long[], java.lang.Boolean)",
      "begin_line": 967,
      "end_line": 981,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 44)",
        "(line 970,col 9)-(line 978,col 9)",
        "(line 980,col 9)-(line 980,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, long[])",
      "begin_line": 992,
      "end_line": 1001,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 34)",
        "(line 994,col 9)-(line 999,col 9)",
        "(line 1000,col 9)-(line 1000,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, long[])",
      "begin_line": 1012,
      "end_line": 1014,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, int[], java.lang.Boolean)",
      "begin_line": 1028,
      "end_line": 1042,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 44)",
        "(line 1031,col 9)-(line 1039,col 9)",
        "(line 1041,col 9)-(line 1041,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, int[])",
      "begin_line": 1053,
      "end_line": 1062,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an\n     * \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1054,col 34)",
        "(line 1055,col 9)-(line 1060,col 9)",
        "(line 1061,col 9)-(line 1061,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, int[])",
      "begin_line": 1073,
      "end_line": 1075,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of an\n     * \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, short[], java.lang.Boolean)",
      "begin_line": 1089,
      "end_line": 1103,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1090,col 9)-(line 1090,col 44)",
        "(line 1092,col 9)-(line 1100,col 9)",
        "(line 1102,col 9)-(line 1102,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, short[])",
      "begin_line": 1114,
      "end_line": 1123,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1115,col 9)-(line 1115,col 34)",
        "(line 1116,col 9)-(line 1121,col 9)",
        "(line 1122,col 9)-(line 1122,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, short[])",
      "begin_line": 1134,
      "end_line": 1136,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1135,col 9)-(line 1135,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, byte[], java.lang.Boolean)",
      "begin_line": 1150,
      "end_line": 1164,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1151,col 9)-(line 1151,col 44)",
        "(line 1153,col 9)-(line 1161,col 9)",
        "(line 1163,col 9)-(line 1163,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, byte[])",
      "begin_line": 1175,
      "end_line": 1184,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1176,col 9)-(line 1176,col 34)",
        "(line 1177,col 9)-(line 1182,col 9)",
        "(line 1183,col 9)-(line 1183,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, byte[])",
      "begin_line": 1195,
      "end_line": 1197,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1196,col 9)-(line 1196,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, char[], java.lang.Boolean)",
      "begin_line": 1211,
      "end_line": 1225,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1212,col 9)-(line 1212,col 44)",
        "(line 1214,col 9)-(line 1222,col 9)",
        "(line 1224,col 9)-(line 1224,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, char[])",
      "begin_line": 1236,
      "end_line": 1245,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1237,col 9)-(line 1237,col 34)",
        "(line 1238,col 9)-(line 1243,col 9)",
        "(line 1244,col 9)-(line 1244,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, char[])",
      "begin_line": 1256,
      "end_line": 1258,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, double[], java.lang.Boolean)",
      "begin_line": 1272,
      "end_line": 1286,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1273,col 9)-(line 1273,col 44)",
        "(line 1275,col 9)-(line 1283,col 9)",
        "(line 1285,col 9)-(line 1285,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, double[])",
      "begin_line": 1297,
      "end_line": 1306,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1298,col 9)-(line 1298,col 34)",
        "(line 1299,col 9)-(line 1304,col 9)",
        "(line 1305,col 9)-(line 1305,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, double[])",
      "begin_line": 1317,
      "end_line": 1319,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1318,col 9)-(line 1318,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, float[], java.lang.Boolean)",
      "begin_line": 1333,
      "end_line": 1347,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1334,col 9)-(line 1334,col 44)",
        "(line 1336,col 9)-(line 1344,col 9)",
        "(line 1346,col 9)-(line 1346,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, float[])",
      "begin_line": 1358,
      "end_line": 1367,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1359,col 9)-(line 1359,col 34)",
        "(line 1360,col 9)-(line 1365,col 9)",
        "(line 1366,col 9)-(line 1366,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, float[])",
      "begin_line": 1378,
      "end_line": 1380,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1379,col 9)-(line 1379,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, boolean[], java.lang.Boolean)",
      "begin_line": 1394,
      "end_line": 1408,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1395,col 9)-(line 1395,col 44)",
        "(line 1397,col 9)-(line 1405,col 9)",
        "(line 1407,col 9)-(line 1407,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, boolean[])",
      "begin_line": 1419,
      "end_line": 1428,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1420,col 9)-(line 1420,col 34)",
        "(line 1421,col 9)-(line 1426,col 9)",
        "(line 1427,col 9)-(line 1427,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, boolean[])",
      "begin_line": 1439,
      "end_line": 1441,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1440,col 9)-(line 1440,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendClassName(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 1451,
      "end_line": 1460,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the class name.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose name to output\n     ",
      "child_ranges": [
        "(line 1452,col 9)-(line 1459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendIdentityHashCode(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 1468,
      "end_line": 1474,
      "comment": "\n     * \u003cp\u003eAppend the {@link System#identityHashCode(java.lang.Object)}.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose id to output\n     ",
      "child_ranges": [
        "(line 1469,col 9)-(line 1473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendContentStart(java.lang.StringBuffer)",
      "begin_line": 1481,
      "end_line": 1483,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the content start.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1482,col 9)-(line 1482,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendContentEnd(java.lang.StringBuffer)",
      "begin_line": 1490,
      "end_line": 1492,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the content end.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1491,col 9)-(line 1491,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendNullText(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1502,
      "end_line": 1504,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an indicator for \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default indicator is \u003ccode\u003e\u0027\u0026lt;null\u0026gt;\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     ",
      "child_ranges": [
        "(line 1503,col 9)-(line 1503,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendFieldSeparator(java.lang.StringBuffer)",
      "begin_line": 1511,
      "end_line": 1513,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the field separator.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1512,col 9)-(line 1512,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendFieldStart(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1521,
      "end_line": 1526,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the field start.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     ",
      "child_ranges": [
        "(line 1522,col 9)-(line 1525,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendFieldEnd(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1534,
      "end_line": 1536,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003ccode\u003e the field end.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1535,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.appendSummarySize(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 1553,
      "end_line": 1557,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a size summary.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe size summary is used to summarize the contents of\n     * \u003ccode\u003eCollections\u003c/code\u003e, \u003ccode\u003eMaps\u003c/code\u003e and arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output consists of a prefix, the passed in size\n     * and a suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default format is \u003ccode\u003e\u0027\u0026lt;size\u003dn\u0026gt;\u0027\u003ccode\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param size  the size to append\n     ",
      "child_ranges": [
        "(line 1554,col 9)-(line 1554,col 37)",
        "(line 1555,col 9)-(line 1555,col 28)",
        "(line 1556,col 9)-(line 1556,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isFullDetail(java.lang.Boolean)",
      "begin_line": 1573,
      "end_line": 1578,
      "comment": "\n     * \u003cp\u003eIs this field to be output in full detail.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method converts a detail request into a detail level.\n     * The calling code may request full detail (\u003ccode\u003etrue\u003c/code\u003e),\n     * but a subclass might ignore that and always return\n     * \u003ccode\u003efalse\u003c/code\u003e. The calling code may pass in\n     * \u003ccode\u003enull\u003c/code\u003e indicating that it doesn\u0027t care about\n     * the detail level. In this case the default detail level is\n     * used.\u003c/p\u003e\n     *\n     * @param fullDetailRequest  the detail level requested\n     * @return whether full detail is to be shown\n     ",
      "child_ranges": [
        "(line 1574,col 9)-(line 1576,col 9)",
        "(line 1577,col 9)-(line 1577,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getShortClassName(java.lang.Class\u003c?\u003e)",
      "begin_line": 1589,
      "end_line": 1591,
      "comment": "\n     * \u003cp\u003eGets the short class name for a class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe short class name is the classname excluding\n     * the package name.\u003c/p\u003e\n     *\n     * @param cls  the \u003ccode\u003eClass\u003c/code\u003e to get the short name of\n     * @return the short name\n     ",
      "child_ranges": [
        "(line 1590,col 9)-(line 1590,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isUseClassName()",
      "begin_line": 1603,
      "end_line": 1605,
      "comment": "\n     * \u003cp\u003eGets whether to use the class name.\u003c/p\u003e\n     *\n     * @return the current useClassName flag\n     ",
      "child_ranges": [
        "(line 1604,col 9)-(line 1604,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setUseClassName(boolean)",
      "begin_line": 1612,
      "end_line": 1614,
      "comment": "\n     * \u003cp\u003eSets whether to use the class name.\u003c/p\u003e\n     *\n     * @param useClassName  the new useClassName flag\n     ",
      "child_ranges": [
        "(line 1613,col 9)-(line 1613,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isUseShortClassName()",
      "begin_line": 1624,
      "end_line": 1626,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1625,col 9)-(line 1625,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setUseShortClassName(boolean)",
      "begin_line": 1634,
      "end_line": 1636,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param useShortClassName  the new useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1635,col 9)-(line 1635,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isUseIdentityHashCode()",
      "begin_line": 1645,
      "end_line": 1647,
      "comment": "\n     * \u003cp\u003eGets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @return the current useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 1646,col 9)-(line 1646,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setUseIdentityHashCode(boolean)",
      "begin_line": 1654,
      "end_line": 1656,
      "comment": "\n     * \u003cp\u003eSets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @param useIdentityHashCode  the new useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 1655,col 9)-(line 1655,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isUseFieldNames()",
      "begin_line": 1665,
      "end_line": 1667,
      "comment": "\n     * \u003cp\u003eGets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @return the current useFieldNames flag\n     ",
      "child_ranges": [
        "(line 1666,col 9)-(line 1666,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setUseFieldNames(boolean)",
      "begin_line": 1674,
      "end_line": 1676,
      "comment": "\n     * \u003cp\u003eSets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @param useFieldNames  the new useFieldNames flag\n     ",
      "child_ranges": [
        "(line 1675,col 9)-(line 1675,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isDefaultFullDetail()",
      "begin_line": 1686,
      "end_line": 1688,
      "comment": "\n     * \u003cp\u003eGets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @return the current defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 1687,col 9)-(line 1687,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setDefaultFullDetail(boolean)",
      "begin_line": 1696,
      "end_line": 1698,
      "comment": "\n     * \u003cp\u003eSets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @param defaultFullDetail  the new defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 1697,col 9)-(line 1697,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isArrayContentDetail()",
      "begin_line": 1707,
      "end_line": 1709,
      "comment": "\n     * \u003cp\u003eGets whether to output array content detail.\u003c/p\u003e\n     *\n     * @return the current array content detail setting\n     ",
      "child_ranges": [
        "(line 1708,col 9)-(line 1708,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setArrayContentDetail(boolean)",
      "begin_line": 1716,
      "end_line": 1718,
      "comment": "\n     * \u003cp\u003eSets whether to output array content detail.\u003c/p\u003e\n     *\n     * @param arrayContentDetail  the new arrayContentDetail flag\n     ",
      "child_ranges": [
        "(line 1717,col 9)-(line 1717,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getArrayStart()",
      "begin_line": 1727,
      "end_line": 1729,
      "comment": "\n     * \u003cp\u003eGets the array start text.\u003c/p\u003e\n     *\n     * @return the current array start text\n     ",
      "child_ranges": [
        "(line 1728,col 9)-(line 1728,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setArrayStart(java.lang.String)",
      "begin_line": 1739,
      "end_line": 1744,
      "comment": "\n     * \u003cp\u003eSets the array start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arrayStart  the new array start text\n     ",
      "child_ranges": [
        "(line 1740,col 9)-(line 1742,col 9)",
        "(line 1743,col 9)-(line 1743,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getArrayEnd()",
      "begin_line": 1753,
      "end_line": 1755,
      "comment": "\n     * \u003cp\u003eGets the array end text.\u003c/p\u003e\n     *\n     * @return the current array end text\n     ",
      "child_ranges": [
        "(line 1754,col 9)-(line 1754,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setArrayEnd(java.lang.String)",
      "begin_line": 1765,
      "end_line": 1770,
      "comment": "\n     * \u003cp\u003eSets the array end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arrayEnd  the new array end text\n     ",
      "child_ranges": [
        "(line 1766,col 9)-(line 1768,col 9)",
        "(line 1769,col 9)-(line 1769,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getArraySeparator()",
      "begin_line": 1779,
      "end_line": 1781,
      "comment": "\n     * \u003cp\u003eGets the array separator text.\u003c/p\u003e\n     *\n     * @return the current array separator text\n     ",
      "child_ranges": [
        "(line 1780,col 9)-(line 1780,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setArraySeparator(java.lang.String)",
      "begin_line": 1791,
      "end_line": 1796,
      "comment": "\n     * \u003cp\u003eSets the array separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arraySeparator  the new array separator text\n     ",
      "child_ranges": [
        "(line 1792,col 9)-(line 1794,col 9)",
        "(line 1795,col 9)-(line 1795,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getContentStart()",
      "begin_line": 1805,
      "end_line": 1807,
      "comment": "\n     * \u003cp\u003eGets the content start text.\u003c/p\u003e\n     *\n     * @return the current content start text\n     ",
      "child_ranges": [
        "(line 1806,col 9)-(line 1806,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setContentStart(java.lang.String)",
      "begin_line": 1817,
      "end_line": 1822,
      "comment": "\n     * \u003cp\u003eSets the content start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param contentStart  the new content start text\n     ",
      "child_ranges": [
        "(line 1818,col 9)-(line 1820,col 9)",
        "(line 1821,col 9)-(line 1821,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getContentEnd()",
      "begin_line": 1831,
      "end_line": 1833,
      "comment": "\n     * \u003cp\u003eGets the content end text.\u003c/p\u003e\n     *\n     * @return the current content end text\n     ",
      "child_ranges": [
        "(line 1832,col 9)-(line 1832,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setContentEnd(java.lang.String)",
      "begin_line": 1843,
      "end_line": 1848,
      "comment": "\n     * \u003cp\u003eSets the content end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param contentEnd  the new content end text\n     ",
      "child_ranges": [
        "(line 1844,col 9)-(line 1846,col 9)",
        "(line 1847,col 9)-(line 1847,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getFieldNameValueSeparator()",
      "begin_line": 1857,
      "end_line": 1859,
      "comment": "\n     * \u003cp\u003eGets the field name value separator text.\u003c/p\u003e\n     *\n     * @return the current field name value separator text\n     ",
      "child_ranges": [
        "(line 1858,col 9)-(line 1858,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setFieldNameValueSeparator(java.lang.String)",
      "begin_line": 1869,
      "end_line": 1874,
      "comment": "\n     * \u003cp\u003eSets the field name value separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param fieldNameValueSeparator  the new field name value separator text\n     ",
      "child_ranges": [
        "(line 1870,col 9)-(line 1872,col 9)",
        "(line 1873,col 9)-(line 1873,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getFieldSeparator()",
      "begin_line": 1883,
      "end_line": 1885,
      "comment": "\n     * \u003cp\u003eGets the field separator text.\u003c/p\u003e\n     *\n     * @return the current field separator text\n     ",
      "child_ranges": [
        "(line 1884,col 9)-(line 1884,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setFieldSeparator(java.lang.String)",
      "begin_line": 1895,
      "end_line": 1900,
      "comment": "\n     * \u003cp\u003eSets the field separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param fieldSeparator  the new field separator text\n     ",
      "child_ranges": [
        "(line 1896,col 9)-(line 1898,col 9)",
        "(line 1899,col 9)-(line 1899,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isFieldSeparatorAtStart()",
      "begin_line": 1911,
      "end_line": 1913,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the start\n     * of each buffer.\u003c/p\u003e\n     *\n     * @return the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1912,col 9)-(line 1912,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setFieldSeparatorAtStart(boolean)",
      "begin_line": 1922,
      "end_line": 1924,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the start\n     * of each buffer.\u003c/p\u003e\n     *\n     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1923,col 9)-(line 1923,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.isFieldSeparatorAtEnd()",
      "begin_line": 1935,
      "end_line": 1937,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the end\n     * of each buffer.\u003c/p\u003e\n     *\n     * @return fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1936,col 9)-(line 1936,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setFieldSeparatorAtEnd(boolean)",
      "begin_line": 1946,
      "end_line": 1948,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the end\n     * of each buffer.\u003c/p\u003e\n     *\n     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1947,col 9)-(line 1947,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getNullText()",
      "begin_line": 1957,
      "end_line": 1959,
      "comment": "\n     * \u003cp\u003eGets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * @return the current text to output when null found\n     ",
      "child_ranges": [
        "(line 1958,col 9)-(line 1958,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setNullText(java.lang.String)",
      "begin_line": 1969,
      "end_line": 1974,
      "comment": "\n     * \u003cp\u003eSets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param nullText  the new text to output when null found\n     ",
      "child_ranges": [
        "(line 1970,col 9)-(line 1972,col 9)",
        "(line 1973,col 9)-(line 1973,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getSizeStartText()",
      "begin_line": 1986,
      "end_line": 1988,
      "comment": "\n     * \u003cp\u003eGets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of size text\n     ",
      "child_ranges": [
        "(line 1987,col 9)-(line 1987,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setSizeStartText(java.lang.String)",
      "begin_line": 2001,
      "end_line": 2006,
      "comment": "\n     * \u003cp\u003eSets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeStartText  the new start of size text\n     ",
      "child_ranges": [
        "(line 2002,col 9)-(line 2004,col 9)",
        "(line 2005,col 9)-(line 2005,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getSizeEndText()",
      "begin_line": 2018,
      "end_line": 2020,
      "comment": "\n     * \u003cp\u003eGets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of size text\n     ",
      "child_ranges": [
        "(line 2019,col 9)-(line 2019,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setSizeEndText(java.lang.String)",
      "begin_line": 2033,
      "end_line": 2038,
      "comment": "\n     * \u003cp\u003eSets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeEndText  the new end of size text\n     ",
      "child_ranges": [
        "(line 2034,col 9)-(line 2036,col 9)",
        "(line 2037,col 9)-(line 2037,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getSummaryObjectStartText()",
      "begin_line": 2050,
      "end_line": 2052,
      "comment": "\n     * \u003cp\u003eGets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of summary text\n     ",
      "child_ranges": [
        "(line 2051,col 9)-(line 2051,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setSummaryObjectStartText(java.lang.String)",
      "begin_line": 2065,
      "end_line": 2070,
      "comment": "\n     * \u003cp\u003eSets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectStartText  the new start of summary text\n     ",
      "child_ranges": [
        "(line 2066,col 9)-(line 2068,col 9)",
        "(line 2069,col 9)-(line 2069,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.getSummaryObjectEndText()",
      "begin_line": 2082,
      "end_line": 2084,
      "comment": "\n     * \u003cp\u003eGets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of summary text\n     ",
      "child_ranges": [
        "(line 2083,col 9)-(line 2083,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.setSummaryObjectEndText(java.lang.String)",
      "begin_line": 2097,
      "end_line": 2102,
      "comment": "\n     * \u003cp\u003eSets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectEndText  the new end of summary text\n     ",
      "child_ranges": [
        "(line 2098,col 9)-(line 2100,col 9)",
        "(line 2101,col 9)-(line 2101,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 2112,
      "end_line": 2139,
      "comment": "\n     * \u003cp\u003eDefault \u003ccode\u003eToStringStyle\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2119,
      "end_line": 2119,
      "comment": "\n         * Required for serialization support.\n         *\n         * @see java.io.Serializable\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.DefaultToStringStyle.DefaultToStringStyle()",
      "begin_line": 2126,
      "end_line": 2128,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2127,col 13)-(line 2127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.DefaultToStringStyle.readResolve()",
      "begin_line": 2135,
      "end_line": 2137,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2136,col 13)-(line 2136,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoFieldNameToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 2150,
      "end_line": 2173,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that does not print out\n     * the field names.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2152,
      "end_line": 2152,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.NoFieldNameToStringStyle.NoFieldNameToStringStyle()",
      "begin_line": 2159,
      "end_line": 2162,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2160,col 13)-(line 2160,col 20)",
        "(line 2161,col 13)-(line 2161,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.NoFieldNameToStringStyle.readResolve()",
      "begin_line": 2169,
      "end_line": 2171,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2170,col 13)-(line 2170,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ShortPrefixToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 2184,
      "end_line": 2207,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that prints out the short\n     * class name and no identity hashcode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2186,
      "end_line": 2186,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.ShortPrefixToStringStyle.ShortPrefixToStringStyle()",
      "begin_line": 2193,
      "end_line": 2197,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2194,col 13)-(line 2194,col 20)",
        "(line 2195,col 13)-(line 2195,col 44)",
        "(line 2196,col 13)-(line 2196,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.ShortPrefixToStringStyle.readResolve()",
      "begin_line": 2203,
      "end_line": 2205,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/ode\u003e after serialization.\u003c/p\u003e\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2204,col 13)-(line 2204,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SimpleToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 2216,
      "end_line": 2242,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that does not print out the\n     * classname, identity hashcode, content start or field name.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2218,
      "end_line": 2218,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.SimpleToStringStyle.SimpleToStringStyle()",
      "begin_line": 2225,
      "end_line": 2232,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2226,col 13)-(line 2226,col 20)",
        "(line 2227,col 13)-(line 2227,col 40)",
        "(line 2228,col 13)-(line 2228,col 47)",
        "(line 2229,col 13)-(line 2229,col 41)",
        "(line 2230,col 13)-(line 2230,col 37)",
        "(line 2231,col 13)-(line 2231,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.SimpleToStringStyle.readResolve()",
      "begin_line": 2238,
      "end_line": 2240,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/ode\u003e after serialization.\u003c/p\u003e\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2239,col 13)-(line 2239,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiLineToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringStyle"
      ],
      "begin_line": 2252,
      "end_line": 2278,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that outputs on multiple lines.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2254,
      "end_line": 2254,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.MultiLineToStringStyle.MultiLineToStringStyle()",
      "begin_line": 2261,
      "end_line": 2267,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2262,col 13)-(line 2262,col 20)",
        "(line 2263,col 13)-(line 2263,col 38)",
        "(line 2264,col 13)-(line 2264,col 70)",
        "(line 2265,col 13)-(line 2265,col 48)",
        "(line 2266,col 13)-(line 2266,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringStyle.MultiLineToStringStyle.readResolve()",
      "begin_line": 2274,
      "end_line": 2276,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2275,col 13)-(line 2275,col 50)"
      ]
    }
  ]
}