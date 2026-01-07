{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/ObjectUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 491,
      "comment": "@Immutable"
    },
    {
      "type": "field",
      "varNames": [
        "NULL"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * \u003cp\u003eSingleton used as a \u003ccode\u003enull\u003c/code\u003e placeholder where\n     * \u003ccode\u003enull\u003c/code\u003e has another meaning.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, in a \u003ccode\u003eHashMap\u003c/code\u003e the\n     * {@link java.util.HashMap#get(java.lang.Object)} method returns\n     * \u003ccode\u003enull\u003c/code\u003e if the \u003ccode\u003eMap\u003c/code\u003e contains\n     * \u003ccode\u003enull\u003c/code\u003e or if there is no matching key. The\n     * \u003ccode\u003eNull\u003c/code\u003e placeholder can be used to distinguish between\n     * these two cases.\u003c/p\u003e\n     *\n     * \u003cp\u003eAnother example is \u003ccode\u003eHashtable\u003c/code\u003e, where \u003ccode\u003enull\u003c/code\u003e\n     * cannot be stored.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis instance is Serializable.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ObjectUtils.ObjectUtils()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eObjectUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eObjectUtils.defaultIfNull(\"a\",\"b\");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.defaultIfNull(T, T)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * \u003cp\u003eReturns a default value if the object passed is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ObjectUtils.defaultIfNull(null, null)      \u003d null\n     * ObjectUtils.defaultIfNull(null, \"\")        \u003d \"\"\n     * ObjectUtils.defaultIfNull(null, \"zz\")      \u003d \"zz\"\n     * ObjectUtils.defaultIfNull(\"abc\", *)        \u003d \"abc\"\n     * ObjectUtils.defaultIfNull(Boolean.TRUE, *) \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param object  the \u003ccode\u003eObject\u003c/code\u003e to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param defaultValue  the default value to return, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003eobject\u003c/code\u003e if it is not \u003ccode\u003enull\u003c/code\u003e, defaultValue otherwise\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.firstNonNull(T...)",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\n     * \u003cp\u003eReturns the first value in the array which is not \u003ccode\u003enull\u003c/code\u003e.\n     * If all the values are \u003ccode\u003enull\u003c/code\u003e or the array is \u003ccode\u003enull\u003c/code\u003e\n     * or empty then \u003ccode\u003enull\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ObjectUtils.firstNonNull(null, null)      \u003d null\n     * ObjectUtils.firstNonNull(null, \"\")        \u003d \"\"\n     * ObjectUtils.firstNonNull(null, null, \"\")  \u003d \"\"\n     * ObjectUtils.firstNonNull(null, \"zz\")      \u003d \"zz\"\n     * ObjectUtils.firstNonNull(\"abc\", *)        \u003d \"abc\"\n     * ObjectUtils.firstNonNull(null, \"xyz\", *)  \u003d \"xyz\"\n     * ObjectUtils.firstNonNull(Boolean.TRUE, *) \u003d Boolean.TRUE\n     * ObjectUtils.firstNonNull()                \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param values  the values to test, may be \u003ccode\u003enull\u003c/code\u003e or empty\n     * @return the first value from \u003ccode\u003evalues\u003c/code\u003e which is not \u003ccode\u003enull\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e if there are no non-null values\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.equals(java.lang.Object, java.lang.Object)",
      "begin_line": 151,
      "end_line": 159,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality, where either one or both\n     * objects may be \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.equals(null, null)                  \u003d true\n     * ObjectUtils.equals(null, \"\")                    \u003d false\n     * ObjectUtils.equals(\"\", null)                    \u003d false\n     * ObjectUtils.equals(\"\", \"\")                      \u003d true\n     * ObjectUtils.equals(Boolean.TRUE, null)          \u003d false\n     * ObjectUtils.equals(Boolean.TRUE, \"true\")        \u003d false\n     * ObjectUtils.equals(Boolean.TRUE, Boolean.TRUE)  \u003d true\n     * ObjectUtils.equals(Boolean.TRUE, Boolean.FALSE) \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param object1  the first object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param object2  the second object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the values of both objects are the same\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.notEqual(java.lang.Object, java.lang.Object)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * \u003cp\u003eCompares two objects for inequality, where either one or both\n     * objects may be \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.notEqual(null, null)                  \u003d false\n     * ObjectUtils.notEqual(null, \"\")                    \u003d true\n     * ObjectUtils.notEqual(\"\", null)                    \u003d true\n     * ObjectUtils.notEqual(\"\", \"\")                      \u003d false\n     * ObjectUtils.notEqual(Boolean.TRUE, null)          \u003d true\n     * ObjectUtils.notEqual(Boolean.TRUE, \"true\")        \u003d true\n     * ObjectUtils.notEqual(Boolean.TRUE, Boolean.TRUE)  \u003d false\n     * ObjectUtils.notEqual(Boolean.TRUE, Boolean.FALSE) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param object1  the first object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param object2  the second object, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003efalse\u003c/code\u003e if the values of both objects are the same\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.hashCode(java.lang.Object)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * \u003cp\u003eGets the hash code of an object returning zero when the\n     * object is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.hashCode(null)   \u003d 0\n     * ObjectUtils.hashCode(obj)    \u003d obj.hashCode()\n     * \u003c/pre\u003e\n     *\n     * @param obj  the object to obtain the hash code of, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the hash code of the object, or zero if null\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.Object)",
      "begin_line": 219,
      "end_line": 226,
      "comment": "\n     * \u003cp\u003eGets the toString that would be produced by \u003ccode\u003eObject\u003c/code\u003e\n     * if a class did not override toString itself. \u003ccode\u003enull\u003c/code\u003e\n     * will return \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.identityToString(null)         \u003d null\n     * ObjectUtils.identityToString(\"\")           \u003d \"java.lang.String@1e23\"\n     * ObjectUtils.identityToString(Boolean.TRUE) \u003d \"java.lang.Boolean@7fa\"\n     * \u003c/pre\u003e\n     *\n     * @param object  the object to create a toString for, may be\n     *  \u003ccode\u003enull\u003c/code\u003e\n     * @return the default toString text, or \u003ccode\u003enull\u003c/code\u003e if\n     *  \u003ccode\u003enull\u003c/code\u003e passed in\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 49)",
        "(line 224,col 9)-(line 224,col 41)",
        "(line 225,col 9)-(line 225,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 243,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eAppends the toString that would be produced by \u003ccode\u003eObject\u003c/code\u003e\n     * if a class did not override toString itself. \u003ccode\u003enull\u003c/code\u003e\n     * will throw a NullPointerException for either of the two parameters. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.identityToString(buf, \"\")            \u003d buf.append(\"java.lang.String@1e23\"\n     * ObjectUtils.identityToString(buf, Boolean.TRUE)  \u003d buf.append(\"java.lang.Boolean@7fa\"\n     * ObjectUtils.identityToString(buf, Boolean.TRUE)  \u003d buf.append(\"java.lang.Boolean@7fa\")\n     * \u003c/pre\u003e\n     *\n     * @param buffer  the buffer to append to\n     * @param object  the object to create a toString for\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 249,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.toString(java.lang.Object)",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003etoString\u003c/code\u003e of an \u003ccode\u003eObject\u003c/code\u003e returning\n     * an empty string (\"\") if \u003ccode\u003enull\u003c/code\u003e input.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ObjectUtils.toString(null)         \u003d \"\"\n     * ObjectUtils.toString(\"\")           \u003d \"\"\n     * ObjectUtils.toString(\"bat\")        \u003d \"bat\"\n     * ObjectUtils.toString(Boolean.TRUE) \u003d \"true\"\n     * \u003c/pre\u003e\n     * \n     * @see StringUtils#defaultString(String)\n     * @see String#valueOf(Object)\n     * @param obj  the Object to \u003ccode\u003etoString\u003c/code\u003e, may be null\n     * @return the passed in Object\u0027s toString, or nullStr if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.toString(java.lang.Object, java.lang.String)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003etoString\u003c/code\u003e of an \u003ccode\u003eObject\u003c/code\u003e returning\n     * a specified text if \u003ccode\u003enull\u003c/code\u003e input.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * ObjectUtils.toString(null, null)           \u003d null\n     * ObjectUtils.toString(null, \"null\")         \u003d \"null\"\n     * ObjectUtils.toString(\"\", \"null\")           \u003d \"\"\n     * ObjectUtils.toString(\"bat\", \"null\")        \u003d \"bat\"\n     * ObjectUtils.toString(Boolean.TRUE, \"null\") \u003d \"true\"\n     * \u003c/pre\u003e\n     * \n     * @see StringUtils#defaultString(String,String)\n     * @see String#valueOf(Object)\n     * @param obj  the Object to \u003ccode\u003etoString\u003c/code\u003e, may be null\n     * @param nullStr  the String to return if \u003ccode\u003enull\u003c/code\u003e input, may be null\n     * @return the passed in Object\u0027s toString, or nullStr if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.min(T...)",
      "begin_line": 312,
      "end_line": 322,
      "comment": "\n     * Null safe comparison of Comparables.\n     * \n     * @param values the set of comparable values, may be null\n     * @return\n     *  \u003cul\u003e\n     *   \u003cli\u003eIf any objects are non-null and unequal, the lesser object.\n     *   \u003cli\u003eIf all objects are non-null and equal, the first.\n     *   \u003cli\u003eIf any of the comparables are null, the lesser of the non-null object.\n     *   \u003cli\u003eIf all the comparables are null, null is returned.\n     *  \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 24)",
        "(line 314,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.max(T...)",
      "begin_line": 336,
      "end_line": 346,
      "comment": "\n     * Null safe comparison of Comparables.\n     * \n     * @param values the set of comparable values, may be null\n     * @return\n     *  \u003cul\u003e\n     *   \u003cli\u003eIf any objects are non-null and unequal, the greater object.\n     *   \u003cli\u003eIf all objects are non-null and equal, the first.\n     *   \u003cli\u003eIf any of the comparables are null, the greater of the non-null object.\n     *   \u003cli\u003eIf all the comparables are null, null is returned.\n     *  \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 24)",
        "(line 338,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.compare(T, T)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\n     * Null safe comparison of Comparables.\n     * {@code null} is assumed to be less than a non-{@code null} value.\n     * \n     * @param c1  the first comparable, may be null\n     * @param c2  the second comparable, may be null\n     * @return a negative value if c1 \u003c c2, zero if c1 \u003d c2\n     * and a positive value if c1 \u003e c2\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.compare(T, T, boolean)",
      "begin_line": 373,
      "end_line": 382,
      "comment": "\n     * Null safe comparison of Comparables.\n     * \n     * @param c1  the first comparable, may be null\n     * @param c2  the second comparable, may be null\n     * @param nullGreater if true \u003ccode\u003enull\u003c/code\u003e is considered greater\n     * than a Non-\u003ccode\u003enull\u003c/code\u003e value or if false \u003ccode\u003enull\u003c/code\u003e is\n     * considered less than a Non-\u003ccode\u003enull\u003c/code\u003e value\n     * @return a negative value if c1 \u003c c2, zero if c1 \u003d c2\n     * and a positive value if c1 \u003e c2\n     * @see java.util.Comparator#compare(Object, Object)\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.clone(T)",
      "begin_line": 393,
      "end_line": 429,
      "comment": "\n     * Clone an object.\n     * \n     * @param \u003cT\u003e the type of the object\n     * @param o the object to clone\n     * @return the clone if the object implements {@link Cloneable} otherwise \u003ccode\u003enull\u003c/code\u003e\n     * @throws CloneFailedException if the object is cloneable and the clone operation fails\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 428,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.cloneIfPossible(T)",
      "begin_line": 445,
      "end_line": 448,
      "comment": "\n     * Clone an object if possible. This method is similar to {@link #clone(Object)}, but will\n     * return the provided instance as the return value instead of \u003ccode\u003enull\u003c/code\u003e if the instance\n     * is not cloneable. This is more convenient if the caller uses different\n     * implementations (e.g. of a service) and some of the implementations do not allow concurrent\n     * processing or have state. In such cases the implementation can simply provide a proper\n     * clone implementation and the caller\u0027s code does not have to change.\n     * \n     * @param \u003cT\u003e the type of the object\n     * @param o the object to clone\n     * @return the clone if the object implements {@link Cloneable} otherwise the object itself\n     * @throws CloneFailedException if the object is cloneable and the clone operation fails\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 33)",
        "(line 447,col 9)-(line 447,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Null",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 466,
      "end_line": 489,
      "comment": "\n     * \u003cp\u003eClass used as a null placeholder where \u003ccode\u003enull\u003c/code\u003e\n     * has another meaning.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, in a \u003ccode\u003eHashMap\u003c/code\u003e the\n     * {@link java.util.HashMap#get(java.lang.Object)} method returns\n     * \u003ccode\u003enull\u003c/code\u003e if the \u003ccode\u003eMap\u003c/code\u003e contains\n     * \u003ccode\u003enull\u003c/code\u003e or if there is no matching key. The\n     * \u003ccode\u003eNull\u003c/code\u003e placeholder can be used to distinguish between\n     * these two cases.\u003c/p\u003e\n     *\n     * \u003cp\u003eAnother example is \u003ccode\u003eHashtable\u003c/code\u003e, where \u003ccode\u003enull\u003c/code\u003e\n     * cannot be stored.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": "\n         * Required for serialization support. Declare serialization compatibility with Commons Lang 1.0\n         * \n         * @see java.io.Serializable\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ObjectUtils.Null.Null()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n         * Restricted constructor - singleton.\n         ",
      "child_ranges": [
        "(line 478,col 13)-(line 478,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.Null.readResolve()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n         * \u003cp\u003eEnsure singleton.\u003c/p\u003e\n         * \n         * @return the singleton value\n         ",
      "child_ranges": [
        "(line 487,col 13)-(line 487,col 36)"
      ]
    }
  ]
}