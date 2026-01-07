{
  "filepath": "/tmp/Lang-43b/src/java/org/apache/commons/lang/builder/ToStringStyle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringStyle",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 2285,
      "comment": "\n * \u003cp\u003eControls \u003ccode\u003eString\u003c/code\u003e formatting for {@link ToStringBuilder}.\n * The main public interface is always via \u003ccode\u003eToStringBuilder\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThese classes are intended to be used as \u003ccode\u003eSingletons\u003c/code\u003e.\n * There is no need to instantiate a new style each time. A program\n * will generally use one of the predefined constants on this class.\n * Alternatively, the {@link StandardToStringStyle} class can be used\n * to set the individual settings. Thus most styles can be achieved\n * without subclassing.\u003c/p\u003e\n *\n * \u003cp\u003eIf required, a subclass can override as many or as few of the\n * methods as it requires. Each object type (from \u003ccode\u003eboolean\u003c/code\u003e\n * to \u003ccode\u003elong\u003c/code\u003e to \u003ccode\u003eObject\u003c/code\u003e to \u003ccode\u003eint[]\u003c/code\u003e) has\n * its own methods to output it. Most have two versions, detail and summary.\n *\n * \u003cp\u003eFor example, the detail version of the array based methods will\n * output the whole array, whereas the summary method will just output\n * the array length.\u003c/p\u003e\n * \n * \u003cp\u003eIf you want to format the output of certain objects, such as dates, you\n * must create a subclass and override a method.\n * \u003cpre\u003e\n * public class MyStyle extends ToStringStyle {\n *   protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {\n *     if (value instanceof Date) {\n *       value \u003d new SimpleDateFormat(\"yyyy-MM-dd\").format(value);\n *     }\n *     buffer.append(value);\n *   }\n * }\n * \u003c/pre\u003e\n * \u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @author Masato Tezuka\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STYLE"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * The default toString style. Using the Using the \u003ccode\u003ePerson\u003c/code\u003e\n     * example from {@link ToStringBuilder}, the output would look like this:\n     * \n     * \u003cpre\u003e\n     * Person@182f0db[name\u003dJohn Doe,age\u003d33,smoker\u003dfalse]\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MULTI_LINE_STYLE"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * The multi line toString style. Using the Using the \u003ccode\u003ePerson\u003c/code\u003e\n     * example from {@link ToStringBuilder}, the output would look like this:\n     * \n     * \u003cpre\u003e\n     * Person@182f0db[\n     *   name\u003dJohn Doe\n     *   age\u003d33\n     *   smoker\u003dfalse\n     * ]\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NO_FIELD_NAMES_STYLE"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * The no field names toString style. Using the Using the\n     * \u003ccode\u003ePerson\u003c/code\u003e example from {@link ToStringBuilder}, the output\n     * would look like this:\n     * \n     * \u003cpre\u003e\n     * Person@182f0db[John Doe,33,false]\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_PREFIX_STYLE"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * The short prefix toString style. Using the \u003ccode\u003ePerson\u003c/code\u003e example\n     * from {@link ToStringBuilder}, the output would look like this:\n     * \n     * \u003cpre\u003e\n     * Person[name\u003dJohn Doe,age\u003d33,smoker\u003dfalse]\n     * \u003c/pre\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SIMPLE_STYLE"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * The simple toString style. Using the Using the \u003ccode\u003ePerson\u003c/code\u003e\n     * example from {@link ToStringBuilder}, the output would look like this:\n     * \n     * \u003cpre\u003e\n     * John Doe,33,false\n     * \u003c/pre\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003e\n     * A registry of objects used by \u003ccode\u003ereflectionToString\u003c/code\u003e methods\n     * to detect cyclical object references and avoid infinite loops.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.Anonymous-2ac79df6-18e8-4db4-b979-bd3a23f9bf51.initialValue()",
      "begin_line": 137,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getRegistry()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003e\n     * Returns the registry of objects being traversed by the \u003ccode\u003ereflectionToString\u003c/code\u003e\n     * methods in the current thread.\n     * \u003c/p\u003e\n     * \n     * @return Set the registry of objects being traversed\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isRegistered(java.lang.Object)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     * Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *                  The object to lookup in the registry.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given\n     *             object.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.register(java.lang.Object)",
      "begin_line": 180,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object. Used by the reflection methods to avoid\n     * infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *                  The object to register.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.unregister(java.lang.Object)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *                  The object to unregister.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "useFieldNames"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n     * Whether to use the field names, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useClassName"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": "\n     * Whether to use the class name, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useShortClassName"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": "\n     * Whether to use short class names, the default is \u003ccode\u003efalse\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useIdentityHashCode"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": "\n     * Whether to use the identity hash code, the default is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contentStart"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n     * The content start \u003ccode\u003e\u0027[\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "contentEnd"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": "\n     * The content end \u003ccode\u003e\u0027]\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldNameValueSeparator"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": "\n     * The field name value separator \u003ccode\u003e\u0027\u003d\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparatorAtStart"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": "\n     * Whether the field separator should be added before any other fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparatorAtEnd"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": "\n     * Whether the field separator should be added after any other fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fieldSeparator"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": "\n     * The field separator \u003ccode\u003e\u0027,\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayStart"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n     * The array start \u003ccode\u003e\u0027{\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arraySeparator"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": "\n     * The array separator \u003ccode\u003e\u0027,\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayContentDetail"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": "\n     * The detail for array content.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrayEnd"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": "\n     * The array end \u003ccode\u003e\u0027}\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultFullDetail"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n     * The value to use when fullDetail is \u003ccode\u003enull\u003c/code\u003e,\n     * the default value is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nullText"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": "\n     * The \u003ccode\u003enull\u003c/code\u003e text \u003ccode\u003e\u0027\u0026lt;null\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sizeStartText"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": "\n     * The summary size text start \u003ccode\u003e\u0027\u003csize\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sizeEndText"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": "\n     * The summary size text start \u003ccode\u003e\u0027\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "summaryObjectStartText"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": "\n     * The summary object text start \u003ccode\u003e\u0027\u0026lt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "summaryObjectEndText"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": "\n     * The summary object text start \u003ccode\u003e\u0027\u0026gt;\u0027\u003c/code\u003e.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.ToStringStyle()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSuper(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the superclass toString.\u003c/p\u003e\n     * \u003cp\u003eNOTE: It assumes that the toString has been created from the same ToStringStyle. \u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e \u003ccode\u003esuperToString\u003c/code\u003e is ignored.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param superToString  the \u003ccode\u003esuper.toString()\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendToString(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 338,
      "end_line": 351,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e another toString.\u003c/p\u003e\n     * \u003cp\u003eNOTE: It assumes that the toString has been created from the same ToStringStyle. \u003c/p\u003e\n     * \n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e \u003ccode\u003etoString\u003c/code\u003e is ignored.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param toString  the additional \u003ccode\u003etoString\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 350,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendStart(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 359,
      "end_line": 368,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the start of data indicator.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to build a \u003ccode\u003etoString\u003c/code\u003e for\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendEnd(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 377,
      "end_line": 383,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the end of data indicator.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to build a\n     *  \u003ccode\u003etoString\u003c/code\u003e for.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 33)",
        "(line 382,col 9)-(line 382,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.removeLastFieldSeparator(java.lang.StringBuffer)",
      "begin_line": 391,
      "end_line": 406,
      "comment": "\n     * \u003cp\u003eRemove the last field separator from the buffer.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 34)",
        "(line 393,col 9)-(line 393,col 45)",
        "(line 394,col 9)-(line 405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, java.lang.Object, java.lang.Boolean)",
      "begin_line": 421,
      "end_line": 432,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing the full \u003ccode\u003etoString\u003c/code\u003e of the\n     * \u003ccode\u003eObject\u003c/code\u003e passed in.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 44)",
        "(line 424,col 9)-(line 429,col 9)",
        "(line 431,col 9)-(line 431,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendInternal(java.lang.StringBuffer, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 453,
      "end_line": 550,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e,\n     * correctly interpreting its type.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method performs the main lookup by Class type to correctly\n     * route arrays, \u003ccode\u003eCollections\u003c/code\u003e, \u003ccode\u003eMaps\u003c/code\u003e and\n     * \u003ccode\u003eObjects\u003c/code\u003e to the appropriate method.\u003c/p\u003e\n     *\n     * \u003cp\u003eEither detail or summary views can be specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a cycle is detected, an object will be appended with the\n     * \u003ccode\u003eObject.toString()\u003c/code\u003e format.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     * @param detail  output detail or not\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 460,col 24)",
        "(line 462,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendCyclicObject(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 564,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value that has been detected to participate in a cycle. This\n     * implementation will print the standard string value of the value.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     *  \n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 565,col 8)-(line 565,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing the full detail of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Collection)",
      "begin_line": 589,
      "end_line": 591,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eCollection\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param coll  the \u003ccode\u003eCollection\u003c/code\u003e to add to the\n     *  \u003ccode\u003etoString\u003c/code\u003e, not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.util.Map)",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eMap\u003ccode\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param map  the \u003ccode\u003eMap\u003c/code\u003e to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 614,
      "end_line": 618,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * value, printing a summary of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/P\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 46)",
        "(line 616,col 9)-(line 616,col 59)",
        "(line 617,col 9)-(line 617,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, long)",
      "begin_line": 630,
      "end_line": 634,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 44)",
        "(line 632,col 9)-(line 632,col 47)",
        "(line 633,col 9)-(line 633,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, long)",
      "begin_line": 644,
      "end_line": 646,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 658,
      "end_line": 662,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 44)",
        "(line 660,col 9)-(line 660,col 47)",
        "(line 661,col 9)-(line 661,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, short)",
      "begin_line": 686,
      "end_line": 690,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 44)",
        "(line 688,col 9)-(line 688,col 47)",
        "(line 689,col 9)-(line 689,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, short)",
      "begin_line": 700,
      "end_line": 702,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, byte)",
      "begin_line": 714,
      "end_line": 718,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 44)",
        "(line 716,col 9)-(line 716,col 47)",
        "(line 717,col 9)-(line 717,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, byte)",
      "begin_line": 728,
      "end_line": 730,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, char)",
      "begin_line": 742,
      "end_line": 746,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 44)",
        "(line 744,col 9)-(line 744,col 47)",
        "(line 745,col 9)-(line 745,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, char)",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, double)",
      "begin_line": 770,
      "end_line": 774,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 44)",
        "(line 772,col 9)-(line 772,col 47)",
        "(line 773,col 9)-(line 773,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, double)",
      "begin_line": 784,
      "end_line": 786,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, float)",
      "begin_line": 798,
      "end_line": 802,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 44)",
        "(line 800,col 9)-(line 800,col 47)",
        "(line 801,col 9)-(line 801,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, float)",
      "begin_line": 812,
      "end_line": 814,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, boolean)",
      "begin_line": 826,
      "end_line": 830,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 44)",
        "(line 828,col 9)-(line 828,col 47)",
        "(line 829,col 9)-(line 829,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, boolean)",
      "begin_line": 840,
      "end_line": 842,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * value.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param value  the value to add to the \u003ccode\u003etoString\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, java.lang.Object[], java.lang.Boolean)",
      "begin_line": 854,
      "end_line": 868,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 44)",
        "(line 857,col 9)-(line 865,col 9)",
        "(line 867,col 9)-(line 867,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object[])",
      "begin_line": 881,
      "end_line": 896,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an\n     * \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 34)",
        "(line 883,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 895,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.reflectionAppendArrayDetail(java.lang.StringBuffer, java.lang.String, java.lang.Object)",
      "begin_line": 907,
      "end_line": 923,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an array type.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 34)",
        "(line 909,col 9)-(line 909,col 44)",
        "(line 910,col 9)-(line 921,col 9)",
        "(line 922,col 9)-(line 922,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, java.lang.Object[])",
      "begin_line": 934,
      "end_line": 936,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of an\n     * \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, long[], java.lang.Boolean)",
      "begin_line": 950,
      "end_line": 964,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003elong\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 44)",
        "(line 953,col 9)-(line 961,col 9)",
        "(line 963,col 9)-(line 963,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, long[])",
      "begin_line": 975,
      "end_line": 984,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 976,col 34)",
        "(line 977,col 9)-(line 982,col 9)",
        "(line 983,col 9)-(line 983,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, long[])",
      "begin_line": 995,
      "end_line": 997,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, int[], java.lang.Boolean)",
      "begin_line": 1011,
      "end_line": 1025,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eint\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 44)",
        "(line 1014,col 9)-(line 1022,col 9)",
        "(line 1024,col 9)-(line 1024,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, int[])",
      "begin_line": 1036,
      "end_line": 1045,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of an\n     * \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 34)",
        "(line 1038,col 9)-(line 1043,col 9)",
        "(line 1044,col 9)-(line 1044,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, int[])",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of an\n     * \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, short[], java.lang.Boolean)",
      "begin_line": 1072,
      "end_line": 1086,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eshort\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1073,col 9)-(line 1073,col 44)",
        "(line 1075,col 9)-(line 1083,col 9)",
        "(line 1085,col 9)-(line 1085,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, short[])",
      "begin_line": 1097,
      "end_line": 1106,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 34)",
        "(line 1099,col 9)-(line 1104,col 9)",
        "(line 1105,col 9)-(line 1105,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, short[])",
      "begin_line": 1117,
      "end_line": 1119,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1118,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, byte[], java.lang.Boolean)",
      "begin_line": 1133,
      "end_line": 1147,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003ebyte\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1134,col 44)",
        "(line 1136,col 9)-(line 1144,col 9)",
        "(line 1146,col 9)-(line 1146,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, byte[])",
      "begin_line": 1158,
      "end_line": 1167,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1159,col 9)-(line 1159,col 34)",
        "(line 1160,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1166,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, byte[])",
      "begin_line": 1178,
      "end_line": 1180,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1179,col 9)-(line 1179,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, char[], java.lang.Boolean)",
      "begin_line": 1194,
      "end_line": 1208,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003echar\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1195,col 9)-(line 1195,col 44)",
        "(line 1197,col 9)-(line 1205,col 9)",
        "(line 1207,col 9)-(line 1207,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, char[])",
      "begin_line": 1219,
      "end_line": 1228,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1220,col 9)-(line 1220,col 34)",
        "(line 1221,col 9)-(line 1226,col 9)",
        "(line 1227,col 9)-(line 1227,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, char[])",
      "begin_line": 1239,
      "end_line": 1241,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1240,col 9)-(line 1240,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, double[], java.lang.Boolean)",
      "begin_line": 1255,
      "end_line": 1269,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003edouble\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1256,col 9)-(line 1256,col 44)",
        "(line 1258,col 9)-(line 1266,col 9)",
        "(line 1268,col 9)-(line 1268,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, double[])",
      "begin_line": 1280,
      "end_line": 1289,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 34)",
        "(line 1282,col 9)-(line 1287,col 9)",
        "(line 1288,col 9)-(line 1288,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, double[])",
      "begin_line": 1300,
      "end_line": 1302,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1301,col 9)-(line 1301,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, float[], java.lang.Boolean)",
      "begin_line": 1316,
      "end_line": 1330,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003efloat\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1317,col 9)-(line 1317,col 44)",
        "(line 1319,col 9)-(line 1327,col 9)",
        "(line 1329,col 9)-(line 1329,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, float[])",
      "begin_line": 1341,
      "end_line": 1350,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1342,col 9)-(line 1342,col 34)",
        "(line 1343,col 9)-(line 1348,col 9)",
        "(line 1349,col 9)-(line 1349,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, float[])",
      "begin_line": 1361,
      "end_line": 1363,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1362,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.append(java.lang.StringBuffer, java.lang.String, boolean[], java.lang.Boolean)",
      "begin_line": 1377,
      "end_line": 1391,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a \u003ccode\u003eboolean\u003c/code\u003e\n     * array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     * @param array  the array to add to the toString\n     * @param fullDetail  \u003ccode\u003etrue\u003c/code\u003e for detail, \u003ccode\u003efalse\u003c/code\u003e\n     *  for summary info, \u003ccode\u003enull\u003c/code\u003e for style decides\n     ",
      "child_ranges": [
        "(line 1378,col 9)-(line 1378,col 44)",
        "(line 1380,col 9)-(line 1388,col 9)",
        "(line 1390,col 9)-(line 1390,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendDetail(java.lang.StringBuffer, java.lang.String, boolean[])",
      "begin_line": 1402,
      "end_line": 1411,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the detail of a\n     * \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1403,col 9)-(line 1403,col 34)",
        "(line 1404,col 9)-(line 1409,col 9)",
        "(line 1410,col 9)-(line 1410,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummary(java.lang.StringBuffer, java.lang.String, boolean[])",
      "begin_line": 1422,
      "end_line": 1424,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a summary of a\n     * \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param array  the array to add to the \u003ccode\u003etoString\u003c/code\u003e,\n     *  not \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1423,col 9)-(line 1423,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendClassName(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 1434,
      "end_line": 1443,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the class name.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose name to output\n     ",
      "child_ranges": [
        "(line 1435,col 9)-(line 1442,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendIdentityHashCode(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 1451,
      "end_line": 1457,
      "comment": "\n     * \u003cp\u003eAppend the {@link System#identityHashCode(java.lang.Object)}.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e whose id to output\n     ",
      "child_ranges": [
        "(line 1452,col 9)-(line 1456,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendContentStart(java.lang.StringBuffer)",
      "begin_line": 1464,
      "end_line": 1466,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the content start.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1465,col 9)-(line 1465,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendContentEnd(java.lang.StringBuffer)",
      "begin_line": 1473,
      "end_line": 1475,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the content end.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1474,col 9)-(line 1474,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendNullText(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1485,
      "end_line": 1487,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e an indicator for \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default indicator is \u003ccode\u003e\u0027\u0026lt;null\u0026gt;\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     ",
      "child_ranges": [
        "(line 1486,col 9)-(line 1486,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendFieldSeparator(java.lang.StringBuffer)",
      "begin_line": 1494,
      "end_line": 1496,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the field separator.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     ",
      "child_ranges": [
        "(line 1495,col 9)-(line 1495,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendFieldStart(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1504,
      "end_line": 1509,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e the field start.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name\n     ",
      "child_ranges": [
        "(line 1505,col 9)-(line 1508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendFieldEnd(java.lang.StringBuffer, java.lang.String)",
      "begin_line": 1517,
      "end_line": 1519,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003ccode\u003e the field end.\u003c/p\u003e\n     * \n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     ",
      "child_ranges": [
        "(line 1518,col 9)-(line 1518,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.appendSummarySize(java.lang.StringBuffer, java.lang.String, int)",
      "begin_line": 1536,
      "end_line": 1540,
      "comment": "\n     * \u003cp\u003eAppend to the \u003ccode\u003etoString\u003c/code\u003e a size summary.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe size summary is used to summarize the contents of\n     * \u003ccode\u003eCollections\u003c/code\u003e, \u003ccode\u003eMaps\u003c/code\u003e and arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output consists of a prefix, the passed in size\n     * and a suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default format is \u003ccode\u003e\u0027\u0026lt;size\u003dn\u0026gt;\u0027\u003ccode\u003e.\u003c/p\u003e\n     *\n     * @param buffer  the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate\n     * @param fieldName  the field name, typically not used as already appended\n     * @param size  the size to append\n     ",
      "child_ranges": [
        "(line 1537,col 9)-(line 1537,col 37)",
        "(line 1538,col 9)-(line 1538,col 28)",
        "(line 1539,col 9)-(line 1539,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isFullDetail(java.lang.Boolean)",
      "begin_line": 1556,
      "end_line": 1561,
      "comment": "\n     * \u003cp\u003eIs this field to be output in full detail.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method converts a detail request into a detail level.\n     * The calling code may request full detail (\u003ccode\u003etrue\u003c/code\u003e),\n     * but a subclass might ignore that and always return\n     * \u003ccode\u003efalse\u003c/code\u003e. The calling code may pass in\n     * \u003ccode\u003enull\u003c/code\u003e indicating that it doesn\u0027t care about\n     * the detail level. In this case the default detail level is\n     * used.\u003c/p\u003e\n     * \n     * @param fullDetailRequest  the detail level requested\n     * @return whether full detail is to be shown\n     ",
      "child_ranges": [
        "(line 1557,col 9)-(line 1559,col 9)",
        "(line 1560,col 9)-(line 1560,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getShortClassName(java.lang.Class)",
      "begin_line": 1572,
      "end_line": 1574,
      "comment": "\n     * \u003cp\u003eGets the short class name for a class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe short class name is the classname excluding\n     * the package name.\u003c/p\u003e\n     *\n     * @param cls  the \u003ccode\u003eClass\u003c/code\u003e to get the short name of\n     * @return the short name\n     ",
      "child_ranges": [
        "(line 1573,col 9)-(line 1573,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseClassName()",
      "begin_line": 1586,
      "end_line": 1588,
      "comment": "\n     * \u003cp\u003eGets whether to use the class name.\u003c/p\u003e\n     *\n     * @return the current useClassName flag\n     ",
      "child_ranges": [
        "(line 1587,col 9)-(line 1587,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseClassName(boolean)",
      "begin_line": 1595,
      "end_line": 1597,
      "comment": "\n     * \u003cp\u003eSets whether to use the class name.\u003c/p\u003e\n     *\n     * @param useClassName  the new useClassName flag\n     ",
      "child_ranges": [
        "(line 1596,col 9)-(line 1596,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseShortClassName()",
      "begin_line": 1607,
      "end_line": 1609,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1608,col 9)-(line 1608,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isShortClassName()",
      "begin_line": 1618,
      "end_line": 1620,
      "comment": "\n     * \u003cp\u003eGets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @return the current shortClassName flag\n     * @deprecated Use {@link #isUseShortClassName()}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 1619,col 9)-(line 1619,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseShortClassName(boolean)",
      "begin_line": 1628,
      "end_line": 1630,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param useShortClassName  the new useShortClassName flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1629,col 9)-(line 1629,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setShortClassName(boolean)",
      "begin_line": 1639,
      "end_line": 1641,
      "comment": "\n     * \u003cp\u003eSets whether to output short or long class names.\u003c/p\u003e\n     *\n     * @param shortClassName  the new shortClassName flag\n     * @deprecated Use {@link #setUseShortClassName(boolean)}\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 1640,col 9)-(line 1640,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseIdentityHashCode()",
      "begin_line": 1650,
      "end_line": 1652,
      "comment": "\n     * \u003cp\u003eGets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @return the current useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 1651,col 9)-(line 1651,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseIdentityHashCode(boolean)",
      "begin_line": 1659,
      "end_line": 1661,
      "comment": "\n     * \u003cp\u003eSets whether to use the identity hash code.\u003c/p\u003e\n     *\n     * @param useIdentityHashCode  the new useIdentityHashCode flag\n     ",
      "child_ranges": [
        "(line 1660,col 9)-(line 1660,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isUseFieldNames()",
      "begin_line": 1670,
      "end_line": 1672,
      "comment": "\n     * \u003cp\u003eGets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @return the current useFieldNames flag\n     ",
      "child_ranges": [
        "(line 1671,col 9)-(line 1671,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setUseFieldNames(boolean)",
      "begin_line": 1679,
      "end_line": 1681,
      "comment": "\n     * \u003cp\u003eSets whether to use the field names passed in.\u003c/p\u003e\n     *\n     * @param useFieldNames  the new useFieldNames flag\n     ",
      "child_ranges": [
        "(line 1680,col 9)-(line 1680,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isDefaultFullDetail()",
      "begin_line": 1691,
      "end_line": 1693,
      "comment": "\n     * \u003cp\u003eGets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @return the current defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 1692,col 9)-(line 1692,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setDefaultFullDetail(boolean)",
      "begin_line": 1701,
      "end_line": 1703,
      "comment": "\n     * \u003cp\u003eSets whether to use full detail when the caller doesn\u0027t\n     * specify.\u003c/p\u003e\n     *\n     * @param defaultFullDetail  the new defaultFullDetail flag\n     ",
      "child_ranges": [
        "(line 1702,col 9)-(line 1702,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isArrayContentDetail()",
      "begin_line": 1712,
      "end_line": 1714,
      "comment": "\n     * \u003cp\u003eGets whether to output array content detail.\u003c/p\u003e\n     *\n     * @return the current array content detail setting\n     ",
      "child_ranges": [
        "(line 1713,col 9)-(line 1713,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArrayContentDetail(boolean)",
      "begin_line": 1721,
      "end_line": 1723,
      "comment": "\n     * \u003cp\u003eSets whether to output array content detail.\u003c/p\u003e\n     *\n     * @param arrayContentDetail  the new arrayContentDetail flag\n     ",
      "child_ranges": [
        "(line 1722,col 9)-(line 1722,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getArrayStart()",
      "begin_line": 1732,
      "end_line": 1734,
      "comment": "\n     * \u003cp\u003eGets the array start text.\u003c/p\u003e\n     *\n     * @return the current array start text\n     ",
      "child_ranges": [
        "(line 1733,col 9)-(line 1733,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArrayStart(java.lang.String)",
      "begin_line": 1744,
      "end_line": 1749,
      "comment": "\n     * \u003cp\u003eSets the array start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arrayStart  the new array start text\n     ",
      "child_ranges": [
        "(line 1745,col 9)-(line 1747,col 9)",
        "(line 1748,col 9)-(line 1748,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getArrayEnd()",
      "begin_line": 1758,
      "end_line": 1760,
      "comment": "\n     * \u003cp\u003eGets the array end text.\u003c/p\u003e\n     *\n     * @return the current array end text\n     ",
      "child_ranges": [
        "(line 1759,col 9)-(line 1759,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArrayEnd(java.lang.String)",
      "begin_line": 1770,
      "end_line": 1775,
      "comment": "\n     * \u003cp\u003eSets the array end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arrayEnd  the new array end text\n     ",
      "child_ranges": [
        "(line 1771,col 9)-(line 1773,col 9)",
        "(line 1774,col 9)-(line 1774,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getArraySeparator()",
      "begin_line": 1784,
      "end_line": 1786,
      "comment": "\n     * \u003cp\u003eGets the array separator text.\u003c/p\u003e\n     *\n     * @return the current array separator text\n     ",
      "child_ranges": [
        "(line 1785,col 9)-(line 1785,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setArraySeparator(java.lang.String)",
      "begin_line": 1796,
      "end_line": 1801,
      "comment": "\n     * \u003cp\u003eSets the array separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param arraySeparator  the new array separator text\n     ",
      "child_ranges": [
        "(line 1797,col 9)-(line 1799,col 9)",
        "(line 1800,col 9)-(line 1800,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getContentStart()",
      "begin_line": 1810,
      "end_line": 1812,
      "comment": "\n     * \u003cp\u003eGets the content start text.\u003c/p\u003e\n     *\n     * @return the current content start text\n     ",
      "child_ranges": [
        "(line 1811,col 9)-(line 1811,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setContentStart(java.lang.String)",
      "begin_line": 1822,
      "end_line": 1827,
      "comment": "\n     * \u003cp\u003eSets the content start text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param contentStart  the new content start text\n     ",
      "child_ranges": [
        "(line 1823,col 9)-(line 1825,col 9)",
        "(line 1826,col 9)-(line 1826,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getContentEnd()",
      "begin_line": 1836,
      "end_line": 1838,
      "comment": "\n     * \u003cp\u003eGets the content end text.\u003c/p\u003e\n     *\n     * @return the current content end text\n     ",
      "child_ranges": [
        "(line 1837,col 9)-(line 1837,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setContentEnd(java.lang.String)",
      "begin_line": 1848,
      "end_line": 1853,
      "comment": "\n     * \u003cp\u003eSets the content end text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param contentEnd  the new content end text\n     ",
      "child_ranges": [
        "(line 1849,col 9)-(line 1851,col 9)",
        "(line 1852,col 9)-(line 1852,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getFieldNameValueSeparator()",
      "begin_line": 1862,
      "end_line": 1864,
      "comment": "\n     * \u003cp\u003eGets the field name value separator text.\u003c/p\u003e\n     *\n     * @return the current field name value separator text\n     ",
      "child_ranges": [
        "(line 1863,col 9)-(line 1863,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldNameValueSeparator(java.lang.String)",
      "begin_line": 1874,
      "end_line": 1879,
      "comment": "\n     * \u003cp\u003eSets the field name value separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param fieldNameValueSeparator  the new field name value separator text\n     ",
      "child_ranges": [
        "(line 1875,col 9)-(line 1877,col 9)",
        "(line 1878,col 9)-(line 1878,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getFieldSeparator()",
      "begin_line": 1888,
      "end_line": 1890,
      "comment": "\n     * \u003cp\u003eGets the field separator text.\u003c/p\u003e\n     *\n     * @return the current field separator text\n     ",
      "child_ranges": [
        "(line 1889,col 9)-(line 1889,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldSeparator(java.lang.String)",
      "begin_line": 1900,
      "end_line": 1905,
      "comment": "\n     * \u003cp\u003eSets the field separator text.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param fieldSeparator  the new field separator text\n     ",
      "child_ranges": [
        "(line 1901,col 9)-(line 1903,col 9)",
        "(line 1904,col 9)-(line 1904,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isFieldSeparatorAtStart()",
      "begin_line": 1916,
      "end_line": 1918,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1917,col 9)-(line 1917,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldSeparatorAtStart(boolean)",
      "begin_line": 1927,
      "end_line": 1929,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the start \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1928,col 9)-(line 1928,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.isFieldSeparatorAtEnd()",
      "begin_line": 1940,
      "end_line": 1942,
      "comment": "\n     * \u003cp\u003eGets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @return fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1941,col 9)-(line 1941,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setFieldSeparatorAtEnd(boolean)",
      "begin_line": 1951,
      "end_line": 1953,
      "comment": "\n     * \u003cp\u003eSets whether the field separator should be added at the end \n     * of each buffer.\u003c/p\u003e\n     * \n     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1952,col 9)-(line 1952,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getNullText()",
      "begin_line": 1962,
      "end_line": 1964,
      "comment": "\n     * \u003cp\u003eGets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * @return the current text to output when null found\n     ",
      "child_ranges": [
        "(line 1963,col 9)-(line 1963,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setNullText(java.lang.String)",
      "begin_line": 1974,
      "end_line": 1979,
      "comment": "\n     * \u003cp\u003eSets the text to output when \u003ccode\u003enull\u003c/code\u003e found.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param nullText  the new text to output when null found\n     ",
      "child_ranges": [
        "(line 1975,col 9)-(line 1977,col 9)",
        "(line 1978,col 9)-(line 1978,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSizeStartText()",
      "begin_line": 1991,
      "end_line": 1993,
      "comment": "\n     * \u003cp\u003eGets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of size text\n     ",
      "child_ranges": [
        "(line 1992,col 9)-(line 1992,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSizeStartText(java.lang.String)",
      "begin_line": 2006,
      "end_line": 2011,
      "comment": "\n     * \u003cp\u003eSets the start text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeStartText  the new start of size text\n     ",
      "child_ranges": [
        "(line 2007,col 9)-(line 2009,col 9)",
        "(line 2010,col 9)-(line 2010,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSizeEndText()",
      "begin_line": 2023,
      "end_line": 2025,
      "comment": "\n     * \u003cp\u003eGets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of size text\n     ",
      "child_ranges": [
        "(line 2024,col 9)-(line 2024,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSizeEndText(java.lang.String)",
      "begin_line": 2038,
      "end_line": 2043,
      "comment": "\n     * \u003cp\u003eSets the end text to output when a \u003ccode\u003eCollection\u003c/code\u003e,\n     * \u003ccode\u003eMap\u003c/code\u003e or array size is output.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param sizeEndText  the new end of size text\n     ",
      "child_ranges": [
        "(line 2039,col 9)-(line 2041,col 9)",
        "(line 2042,col 9)-(line 2042,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSummaryObjectStartText()",
      "begin_line": 2055,
      "end_line": 2057,
      "comment": "\n     * \u003cp\u003eGets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * @return the current start of summary text\n     ",
      "child_ranges": [
        "(line 2056,col 9)-(line 2056,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSummaryObjectStartText(java.lang.String)",
      "begin_line": 2070,
      "end_line": 2075,
      "comment": "\n     * \u003cp\u003eSets the start text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output before the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectStartText  the new start of summary text\n     ",
      "child_ranges": [
        "(line 2071,col 9)-(line 2073,col 9)",
        "(line 2074,col 9)-(line 2074,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.getSummaryObjectEndText()",
      "begin_line": 2087,
      "end_line": 2089,
      "comment": "\n     * \u003cp\u003eGets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * @return the current end of summary text\n     ",
      "child_ranges": [
        "(line 2088,col 9)-(line 2088,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.setSummaryObjectEndText(java.lang.String)",
      "begin_line": 2102,
      "end_line": 2107,
      "comment": "\n     * \u003cp\u003eSets the end text to output when an \u003ccode\u003eObject\u003c/code\u003e is\n     * output in summary mode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is output after the size value.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is accepted, but will be converted to\n     * an empty String.\u003c/p\u003e\n     *\n     * @param summaryObjectEndText  the new end of summary text\n     ",
      "child_ranges": [
        "(line 2103,col 9)-(line 2105,col 9)",
        "(line 2106,col 9)-(line 2106,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2117,
      "end_line": 2144,
      "comment": "\n     * \u003cp\u003eDefault \u003ccode\u003eToStringStyle\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2124,
      "end_line": 2124,
      "comment": "\n         * Required for serialization support.\n         * \n         * @see java.io.Serializable\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.DefaultToStringStyle.DefaultToStringStyle()",
      "begin_line": 2131,
      "end_line": 2133,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2132,col 13)-(line 2132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.DefaultToStringStyle.readResolve()",
      "begin_line": 2140,
      "end_line": 2142,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2141,col 13)-(line 2141,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoFieldNameToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2155,
      "end_line": 2178,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that does not print out\n     * the field names.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2157,
      "end_line": 2157,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.NoFieldNameToStringStyle.NoFieldNameToStringStyle()",
      "begin_line": 2164,
      "end_line": 2167,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2165,col 13)-(line 2165,col 20)",
        "(line 2166,col 13)-(line 2166,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.NoFieldNameToStringStyle.readResolve()",
      "begin_line": 2174,
      "end_line": 2176,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2175,col 13)-(line 2175,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ShortPrefixToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2189,
      "end_line": 2212,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that prints out the short\n     * class name and no identity hashcode.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2191,
      "end_line": 2191,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.ShortPrefixToStringStyle.ShortPrefixToStringStyle()",
      "begin_line": 2198,
      "end_line": 2202,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2199,col 13)-(line 2199,col 20)",
        "(line 2200,col 13)-(line 2200,col 44)",
        "(line 2201,col 13)-(line 2201,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.ShortPrefixToStringStyle.readResolve()",
      "begin_line": 2208,
      "end_line": 2210,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/ode\u003e after serialization.\u003c/p\u003e\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2209,col 13)-(line 2209,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SimpleToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2221,
      "end_line": 2247,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that does not print out the\n     * classname, identity hashcode, content start or field name.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2223,
      "end_line": 2223,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.SimpleToStringStyle()",
      "begin_line": 2230,
      "end_line": 2237,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2231,col 13)-(line 2231,col 20)",
        "(line 2232,col 13)-(line 2232,col 40)",
        "(line 2233,col 13)-(line 2233,col 47)",
        "(line 2234,col 13)-(line 2234,col 41)",
        "(line 2235,col 13)-(line 2235,col 37)",
        "(line 2236,col 13)-(line 2236,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.SimpleToStringStyle.readResolve()",
      "begin_line": 2243,
      "end_line": 2245,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/ode\u003e after serialization.\u003c/p\u003e\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2244,col 13)-(line 2244,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiLineToStringStyle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringStyle"
      ],
      "begin_line": 2257,
      "end_line": 2283,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eToStringStyle\u003c/code\u003e that outputs on multiple lines.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an inner class rather than using\n     * \u003ccode\u003eStandardToStringStyle\u003c/code\u003e to ensure its immutability.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2259,
      "end_line": 2259,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle.MultiLineToStringStyle()",
      "begin_line": 2266,
      "end_line": 2272,
      "comment": "\n         * \u003cp\u003eConstructor.\u003c/p\u003e\n         *\n         * \u003cp\u003eUse the static constant rather than instantiating.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 2267,col 13)-(line 2267,col 20)",
        "(line 2268,col 13)-(line 2268,col 38)",
        "(line 2269,col 13)-(line 2269,col 70)",
        "(line 2270,col 13)-(line 2270,col 48)",
        "(line 2271,col 13)-(line 2271,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ToStringStyle.MultiLineToStringStyle.readResolve()",
      "begin_line": 2279,
      "end_line": 2281,
      "comment": "\n         * \u003cp\u003eEnsure \u003ccode\u003eSingleton\u003c/code\u003e after serialization.\u003c/p\u003e\n         *\n         * @return the singleton\n         ",
      "child_ranges": [
        "(line 2280,col 13)-(line 2280,col 50)"
      ]
    }
  ]
}