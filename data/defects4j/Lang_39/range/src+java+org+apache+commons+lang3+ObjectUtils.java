{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/ObjectUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 354,
      "comment": "@Immutable"
    },
    {
      "type": "field",
      "varNames": [
        "NULL"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * \u003cp\u003eSingleton used as a \u003ccode\u003enull\u003c/code\u003e placeholder where\n     * \u003ccode\u003enull\u003c/code\u003e has another meaning.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, in a \u003ccode\u003eHashMap\u003c/code\u003e the\n     * {@link java.util.HashMap#get(java.lang.Object)} method returns\n     * \u003ccode\u003enull\u003c/code\u003e if the \u003ccode\u003eMap\u003c/code\u003e contains\n     * \u003ccode\u003enull\u003c/code\u003e or if there is no matching key. The\n     * \u003ccode\u003eNull\u003c/code\u003e placeholder can be used to distinguish between\n     * these two cases.\u003c/p\u003e\n     *\n     * \u003cp\u003eAnother example is \u003ccode\u003eHashtable\u003c/code\u003e, where \u003ccode\u003enull\u003c/code\u003e\n     * cannot be stored.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis instance is Serializable.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ObjectUtils.ObjectUtils()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eObjectUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eObjectUtils.defaultIfNull(\"a\",\"b\");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.defaultIfNull(java.lang.Object, java.lang.Object)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * \u003cp\u003eReturns a default value if the object passed is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ObjectUtils.defaultIfNull(null, null)      \u003d null\n     * ObjectUtils.defaultIfNull(null, \"\")        \u003d \"\"\n     * ObjectUtils.defaultIfNull(null, \"zz\")      \u003d \"zz\"\n     * ObjectUtils.defaultIfNull(\"abc\", *)        \u003d \"abc\"\n     * ObjectUtils.defaultIfNull(Boolean.TRUE, *) \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param defaultValue  the default value to return, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003eobject\u003c/code\u003e if it is not \u003ccode\u003enull\u003c/code\u003e, defaultValue otherwise\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.firstNonNull(T...)",
      "begin_line": 113,
      "end_line": 122,
      "comment": "\n     * \u003cp\u003eReturns the first value in the array which is not \u003ccode\u003enull\u003c/code\u003e.\n     * If all the values are \u003ccode\u003enull\u003c/code\u003e or the array is \u003ccode\u003enull\u003c/code\u003e\n     * or empty then \u003ccode\u003enull\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ObjectUtils.firstNonNull(null, null)      \u003d null\n     * ObjectUtils.firstNonNull(null, \"\")        \u003d \"\"\n     * ObjectUtils.firstNonNull(null, null, \"\")  \u003d \"\"\n     * ObjectUtils.firstNonNull(null, \"zz\")      \u003d \"zz\"\n     * ObjectUtils.firstNonNull(\"abc\", *)        \u003d \"abc\"\n     * ObjectUtils.firstNonNull(null, \"xyz\", *)  \u003d \"xyz\"\n     * ObjectUtils.firstNonNull(Boolean.TRUE, *) \u003d Boolean.TRUE\n     * ObjectUtils.firstNonNull()                \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param values  the values to test, may be \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the first value from \u003ccode\u003evalues\u003c/code\u003e which is not \u003ccode\u003enull\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e if there are no non-null values\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.equals(java.lang.Object, java.lang.Object)",
      "begin_line": 145,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality, where either one or both\n     * objects may be \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.equals(null, null)                  \u003d true\n     * ObjectUtils.equals(null, \"\")                    \u003d false\n     * ObjectUtils.equals(\"\", null)                    \u003d false\n     * ObjectUtils.equals(\"\", \"\")                      \u003d true\n     * ObjectUtils.equals(Boolean.TRUE, null)          \u003d false\n     * ObjectUtils.equals(Boolean.TRUE, \"true\")        \u003d false\n     * ObjectUtils.equals(Boolean.TRUE, Boolean.TRUE)  \u003d true\n     * ObjectUtils.equals(Boolean.TRUE, Boolean.FALSE) \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param object1  the first object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param object2  the second object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the values of both objects are the same\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.hashCode(java.lang.Object)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eGets the hash code of an object returning zero when the\n     * object is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.hashCode(null)   \u003d 0\n     * ObjectUtils.hashCode(obj)    \u003d obj.hashCode()\n     * \u003c/pre\u003e\n     *\n     * @param obj  the object to obtain the hash code of, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the hash code of the object, or zero if null\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.Object)",
      "begin_line": 190,
      "end_line": 197,
      "comment": "\n     * \u003cp\u003eGets the toString that would be produced by \u003ccode\u003eObject\u003c/code\u003e\n     * if a class did not override toString itself. \u003ccode\u003enull\u003c/code\u003e\n     * will return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.identityToString(null)         \u003d null\n     * ObjectUtils.identityToString(\"\")           \u003d \"java.lang.String@1e23\"\n     * ObjectUtils.identityToString(Boolean.TRUE) \u003d \"java.lang.Boolean@7fa\"\n     * \u003c/pre\u003e\n     *\n     * @param object  the object to create a toString for, may be\n     *  \u003ccode\u003enull\u003c/code\u003e\n     * @return the default toString text, or \u003ccode\u003enull\u003c/code\u003e if\n     *  \u003ccode\u003enull\u003c/code\u003e passed in\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 49)",
        "(line 195,col 9)-(line 195,col 41)",
        "(line 196,col 9)-(line 196,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 214,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eAppends the toString that would be produced by \u003ccode\u003eObject\u003c/code\u003e\n     * if a class did not override toString itself. \u003ccode\u003enull\u003c/code\u003e\n     * will throw a NullPointerException for either of the two parameters. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.identityToString(buf, \"\")            \u003d buf.append(\"java.lang.String@1e23\"\n     * ObjectUtils.identityToString(buf, Boolean.TRUE)  \u003d buf.append(\"java.lang.Boolean@7fa\"\n     * ObjectUtils.identityToString(buf, Boolean.TRUE)  \u003d buf.append(\"java.lang.Boolean@7fa\")\n     * \u003c/pre\u003e\n     *\n     * @param buffer  the buffer to append to\n     * @param object  the object to create a toString for\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 220,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.toString(java.lang.Object)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003etoString\u003c/code\u003e of an \u003ccode\u003eObject\u003c/code\u003e returning\n     * an empty string (\"\") if \u003ccode\u003enull\u003c/code\u003e input.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ObjectUtils.toString(null)         \u003d \"\"\n     * ObjectUtils.toString(\"\")           \u003d \"\"\n     * ObjectUtils.toString(\"bat\")        \u003d \"bat\"\n     * ObjectUtils.toString(Boolean.TRUE) \u003d \"true\"\n     * \u003c/pre\u003e\n     * \n     * @see StringUtils#defaultString(String)\n     * @see String#valueOf(Object)\n     * @param obj  the Object to \u003ccode\u003etoString\u003c/code\u003e, may be null\n     * @return the passed in Object\u0027s toString, or nullStr if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.toString(java.lang.Object, java.lang.String)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003etoString\u003c/code\u003e of an \u003ccode\u003eObject\u003c/code\u003e returning\n     * a specified text if \u003ccode\u003enull\u003c/code\u003e input.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ObjectUtils.toString(null, null)           \u003d null\n     * ObjectUtils.toString(null, \"null\")         \u003d \"null\"\n     * ObjectUtils.toString(\"\", \"null\")           \u003d \"\"\n     * ObjectUtils.toString(\"bat\", \"null\")        \u003d \"bat\"\n     * ObjectUtils.toString(Boolean.TRUE, \"null\") \u003d \"true\"\n     * \u003c/pre\u003e\n     * \n     * @see StringUtils#defaultString(String,String)\n     * @see String#valueOf(Object)\n     * @param obj  the Object to \u003ccode\u003etoString\u003c/code\u003e, may be null\n     * @param nullStr  the String to return if \u003ccode\u003enull\u003c/code\u003e input, may be null\n     * @return the passed in Object\u0027s toString, or nullStr if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.min(T, T)",
      "begin_line": 284,
      "end_line": 290,
      "comment": "\n     * Null safe comparison of Comparables.\n     * \n     * @param c1  the first comparable, may be null\n     * @param c2  the second comparable, may be null\n     * @return\n     *  \u003cul\u003e\n     *   \u003cli\u003eIf both objects are non-null and unequal, the lesser object.\n     *   \u003cli\u003eIf both objects are non-null and equal, c1.\n     *   \u003cli\u003eIf one of the comparables is null, the non-null object.\n     *   \u003cli\u003eIf both the comparables are null, null is returned.\n     *  \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 289,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.max(T, T)",
      "begin_line": 305,
      "end_line": 311,
      "comment": "\n     * Null safe comparison of Comparables.\n     * \n     * @param c1  the first comparable, may be null\n     * @param c2  the second comparable, may be null\n     * @return\n     *  \u003cul\u003e\n     *   \u003cli\u003eIf both objects are non-null and unequal, the greater object.\n     *   \u003cli\u003eIf both objects are non-null and equal, c1.\n     *   \u003cli\u003eIf one of the comparables is null, the non-null object.\n     *   \u003cli\u003eIf both the comparables are null, null is returned.\n     *  \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 310,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Null",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 329,
      "end_line": 352,
      "comment": "\n     * \u003cp\u003eClass used as a null placeholder where \u003ccode\u003enull\u003c/code\u003e\n     * has another meaning.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, in a \u003ccode\u003eHashMap\u003c/code\u003e the\n     * {@link java.util.HashMap#get(java.lang.Object)} method returns\n     * \u003ccode\u003enull\u003c/code\u003e if the \u003ccode\u003eMap\u003c/code\u003e contains\n     * \u003ccode\u003enull\u003c/code\u003e or if there is no matching key. The\n     * \u003ccode\u003eNull\u003c/code\u003e placeholder can be used to distinguish between\n     * these two cases.\u003c/p\u003e\n     *\n     * \u003cp\u003eAnother example is \u003ccode\u003eHashtable\u003c/code\u003e, where \u003ccode\u003enull\u003c/code\u003e\n     * cannot be stored.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": "\n         * Required for serialization support. Declare serialization compatibility with Commons Lang 1.0\n         * \n         * @see java.io.Serializable\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ObjectUtils.Null.Null()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n         * Restricted constructor - singleton.\n         ",
      "child_ranges": [
        "(line 341,col 13)-(line 341,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.Null.readResolve()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n         * \u003cp\u003eEnsure singleton.\u003c/p\u003e\n         * \n         * @return the singleton value\n         ",
      "child_ranges": [
        "(line 350,col 13)-(line 350,col 36)"
      ]
    }
  ]
}