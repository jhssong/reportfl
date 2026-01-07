{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/ObjectUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 521,
      "comment": "@Immutable"
    },
    {
      "type": "field",
      "varNames": [
        "NULL"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003eSingleton used as a {@code null} placeholder where\n     * {@code null} has another meaning.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, in a {@code HashMap} the\n     * {@link java.util.HashMap#get(java.lang.Object)} method returns\n     * {@code null} if the {@code Map} contains {@code null} or if there\n     * is no matching key. The {@code Null} placeholder can be used to\n     * distinguish between these two cases.\u003c/p\u003e\n     *\n     * \u003cp\u003eAnother example is {@code Hashtable}, where {@code null}\n     * cannot be stored.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis instance is Serializable.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ObjectUtils.ObjectUtils()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * \u003cp\u003e{@code ObjectUtils} instances should NOT be constructed in\n     * standard programming. Instead, the static methods on the class should\n     * be used, such as {@code ObjectUtils.defaultIfNull(\"a\",\"b\");}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.defaultIfNull(T, T)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * \u003cp\u003eReturns a default value if the object passed is {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.defaultIfNull(null, null)      \u003d null\n     * ObjectUtils.defaultIfNull(null, \"\")        \u003d \"\"\n     * ObjectUtils.defaultIfNull(null, \"zz\")      \u003d \"zz\"\n     * ObjectUtils.defaultIfNull(\"abc\", *)        \u003d \"abc\"\n     * ObjectUtils.defaultIfNull(Boolean.TRUE, *) \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the type of the object\n     * @param object  the {@code Object} to test, may be {@code null}\n     * @param defaultValue  the default value to return, may be {@code null}\n     * @return {@code object} if it is not {@code null}, defaultValue otherwise\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.firstNonNull(T...)",
      "begin_line": 113,
      "end_line": 122,
      "comment": "\n     * \u003cp\u003eReturns the first value in the array which is not {@code null}.\n     * If all the values are {@code null} or the array is {@code null}\n     * or empty then {@code null} is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.firstNonNull(null, null)      \u003d null\n     * ObjectUtils.firstNonNull(null, \"\")        \u003d \"\"\n     * ObjectUtils.firstNonNull(null, null, \"\")  \u003d \"\"\n     * ObjectUtils.firstNonNull(null, \"zz\")      \u003d \"zz\"\n     * ObjectUtils.firstNonNull(\"abc\", *)        \u003d \"abc\"\n     * ObjectUtils.firstNonNull(null, \"xyz\", *)  \u003d \"xyz\"\n     * ObjectUtils.firstNonNull(Boolean.TRUE, *) \u003d Boolean.TRUE\n     * ObjectUtils.firstNonNull()                \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the component type of the array\n     * @param values  the values to test, may be {@code null} or empty\n     * @return the first value from {@code values} which is not {@code null},\n     *  or {@code null} if there are no non-null values\n     * @since 3.0\n     ",
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
      "comment": "\n     * \u003cp\u003eCompares two objects for equality, where either one or both\n     * objects may be {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.equals(null, null)                  \u003d true\n     * ObjectUtils.equals(null, \"\")                    \u003d false\n     * ObjectUtils.equals(\"\", null)                    \u003d false\n     * ObjectUtils.equals(\"\", \"\")                      \u003d true\n     * ObjectUtils.equals(Boolean.TRUE, null)          \u003d false\n     * ObjectUtils.equals(Boolean.TRUE, \"true\")        \u003d false\n     * ObjectUtils.equals(Boolean.TRUE, Boolean.TRUE)  \u003d true\n     * ObjectUtils.equals(Boolean.TRUE, Boolean.FALSE) \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param object1  the first object, may be {@code null}\n     * @param object2  the second object, may be {@code null}\n     * @return {@code true} if the values of both objects are the same\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.notEqual(java.lang.Object, java.lang.Object)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * \u003cp\u003eCompares two objects for inequality, where either one or both\n     * objects may be {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.notEqual(null, null)                  \u003d false\n     * ObjectUtils.notEqual(null, \"\")                    \u003d true\n     * ObjectUtils.notEqual(\"\", null)                    \u003d true\n     * ObjectUtils.notEqual(\"\", \"\")                      \u003d false\n     * ObjectUtils.notEqual(Boolean.TRUE, null)          \u003d true\n     * ObjectUtils.notEqual(Boolean.TRUE, \"true\")        \u003d true\n     * ObjectUtils.notEqual(Boolean.TRUE, Boolean.TRUE)  \u003d false\n     * ObjectUtils.notEqual(Boolean.TRUE, Boolean.FALSE) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param object1  the first object, may be {@code null}\n     * @param object2  the second object, may be {@code null}\n     * @return {@code false} if the values of both objects are the same\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.hashCode(java.lang.Object)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003eGets the hash code of an object returning zero when the\n     * object is {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.hashCode(null)   \u003d 0\n     * ObjectUtils.hashCode(obj)    \u003d obj.hashCode()\n     * \u003c/pre\u003e\n     *\n     * @param obj  the object to obtain the hash code of, may be {@code null}\n     * @return the hash code of the object, or zero if null\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.hashCodeMulti(java.lang.Object...)",
      "begin_line": 216,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003eGets the hash code for multiple objects.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis allows a hash code to be rapidly calculated for a number of objects.\n     * The hash code for a single object is the \u003cem\u003enot\u003c/em\u003e same as {@link #hashCode(Object)}.\n     * The hash code for multiple objects is the same as that calculated by an\n     * {@code ArrayList} containing the specified objects.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.hashCodeMulti()                 \u003d 1\n     * ObjectUtils.hashCodeMulti((Object[]) null)  \u003d 1\n     * ObjectUtils.hashCodeMulti(a)                \u003d 31 + a.hashCode()\n     * ObjectUtils.hashCodeMulti(a,b)              \u003d (31 + a.hashCode()) * 31 + b.hashCode()\n     * ObjectUtils.hashCodeMulti(a,b,c)            \u003d ((31 + a.hashCode()) * 31 + b.hashCode()) * 31 + c.hashCode()\n     * \u003c/pre\u003e\n     *\n     * @param objects  the objects to obtain the hash code of, may be {@code null}\n     * @return the hash code of the objects, or zero if null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 21)",
        "(line 218,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.Object)",
      "begin_line": 244,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eGets the toString that would be produced by {@code Object}\n     * if a class did not override toString itself. {@code null}\n     * will return {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.identityToString(null)         \u003d null\n     * ObjectUtils.identityToString(\"\")           \u003d \"java.lang.String@1e23\"\n     * ObjectUtils.identityToString(Boolean.TRUE) \u003d \"java.lang.Boolean@7fa\"\n     * \u003c/pre\u003e\n     *\n     * @param object  the object to create a toString for, may be\n     *  {@code null}\n     * @return the default toString text, or {@code null} if\n     *  {@code null} passed in\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 49)",
        "(line 249,col 9)-(line 249,col 41)",
        "(line 250,col 9)-(line 250,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.identityToString(java.lang.StringBuffer, java.lang.Object)",
      "begin_line": 268,
      "end_line": 275,
      "comment": "\n     * \u003cp\u003eAppends the toString that would be produced by {@code Object}\n     * if a class did not override toString itself. {@code null}\n     * will throw a NullPointerException for either of the two parameters. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.identityToString(buf, \"\")            \u003d buf.append(\"java.lang.String@1e23\"\n     * ObjectUtils.identityToString(buf, Boolean.TRUE)  \u003d buf.append(\"java.lang.Boolean@7fa\"\n     * ObjectUtils.identityToString(buf, Boolean.TRUE)  \u003d buf.append(\"java.lang.Boolean@7fa\")\n     * \u003c/pre\u003e\n     *\n     * @param buffer  the buffer to append to\n     * @param object  the object to create a toString for\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 274,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.toString(java.lang.Object)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eGets the {@code toString} of an {@code Object} returning\n     * an empty string (\"\") if {@code null} input.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.toString(null)         \u003d \"\"\n     * ObjectUtils.toString(\"\")           \u003d \"\"\n     * ObjectUtils.toString(\"bat\")        \u003d \"bat\"\n     * ObjectUtils.toString(Boolean.TRUE) \u003d \"true\"\n     * \u003c/pre\u003e\n     *\n     * @see StringUtils#defaultString(String)\n     * @see String#valueOf(Object)\n     * @param obj  the Object to {@code toString}, may be null\n     * @return the passed in Object\u0027s toString, or nullStr if {@code null} input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.toString(java.lang.Object, java.lang.String)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * \u003cp\u003eGets the {@code toString} of an {@code Object} returning\n     * a specified text if {@code null} input.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * ObjectUtils.toString(null, null)           \u003d null\n     * ObjectUtils.toString(null, \"null\")         \u003d \"null\"\n     * ObjectUtils.toString(\"\", \"null\")           \u003d \"\"\n     * ObjectUtils.toString(\"bat\", \"null\")        \u003d \"bat\"\n     * ObjectUtils.toString(Boolean.TRUE, \"null\") \u003d \"true\"\n     * \u003c/pre\u003e\n     *\n     * @see StringUtils#defaultString(String,String)\n     * @see String#valueOf(Object)\n     * @param obj  the Object to {@code toString}, may be null\n     * @param nullStr  the String to return if {@code null} input, may be null\n     * @return the passed in Object\u0027s toString, or nullStr if {@code null} input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.min(T...)",
      "begin_line": 338,
      "end_line": 348,
      "comment": "\n     * \u003cp\u003eNull safe comparison of Comparables.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e type of the values processed by this method\n     * @param values the set of comparable values, may be null\n     * @return\n     *  \u003cul\u003e\n     *   \u003cli\u003eIf any objects are non-null and unequal, the lesser object.\n     *   \u003cli\u003eIf all objects are non-null and equal, the first.\n     *   \u003cli\u003eIf any of the comparables are null, the lesser of the non-null objects.\n     *   \u003cli\u003eIf all the comparables are null, null is returned.\n     *  \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 24)",
        "(line 340,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.max(T...)",
      "begin_line": 363,
      "end_line": 373,
      "comment": "\n     * \u003cp\u003eNull safe comparison of Comparables.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e type of the values processed by this method\n     * @param values the set of comparable values, may be null\n     * @return\n     *  \u003cul\u003e\n     *   \u003cli\u003eIf any objects are non-null and unequal, the greater object.\n     *   \u003cli\u003eIf all objects are non-null and equal, the first.\n     *   \u003cli\u003eIf any of the comparables are null, the greater of the non-null objects.\n     *   \u003cli\u003eIf all the comparables are null, null is returned.\n     *  \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 24)",
        "(line 365,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.compare(T, T)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\n     * \u003cp\u003eNull safe comparison of Comparables.\n     * {@code null} is assumed to be less than a non-{@code null} value.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e type of the values processed by this method\n     * @param c1  the first comparable, may be null\n     * @param c2  the second comparable, may be null\n     * @return a negative value if c1 \u003c c2, zero if c1 \u003d c2\n     *  and a positive value if c1 \u003e c2\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.compare(T, T, boolean)",
      "begin_line": 402,
      "end_line": 411,
      "comment": "\n     * \u003cp\u003eNull safe comparison of Comparables.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e type of the values processed by this method\n     * @param c1  the first comparable, may be null\n     * @param c2  the second comparable, may be null\n     * @param nullGreater if true {@code null} is considered greater\n     *  than a non-{@code null} value or if false {@code null} is\n     *  considered less than a Non-{@code null} value\n     * @return a negative value if c1 \u003c c2, zero if c1 \u003d c2\n     *  and a positive value if c1 \u003e c2\n     * @see java.util.Comparator#compare(Object, Object)\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.clone(T)",
      "begin_line": 422,
      "end_line": 458,
      "comment": "\n     * \u003cp\u003eClone an object.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the object\n     * @param obj  the object to clone, null returns null\n     * @return the clone if the object implements {@link Cloneable} otherwise {@code null}\n     * @throws CloneFailedException if the object is cloneable and the clone operation fails\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 457,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.cloneIfPossible(T)",
      "begin_line": 476,
      "end_line": 479,
      "comment": "\n     * \u003cp\u003eClone an object if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is similar to {@link #clone(Object)}, but will return the provided\n     * instance as the return value instead of {@code null} if the instance\n     * is not cloneable. This is more convenient if the caller uses different\n     * implementations (e.g. of a service) and some of the implementations do not allow concurrent\n     * processing or have state. In such cases the implementation can simply provide a proper\n     * clone implementation and the caller\u0027s code does not have to change.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the object\n     * @param obj  the object to clone, null returns null\n     * @return the clone if the object implements {@link Cloneable} otherwise the object itself\n     * @throws CloneFailedException if the object is cloneable and the clone operation fails\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 35)",
        "(line 478,col 9)-(line 478,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Null",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 496,
      "end_line": 519,
      "comment": "\n     * \u003cp\u003eClass used as a null placeholder where {@code null}\n     * has another meaning.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, in a {@code HashMap} the\n     * {@link java.util.HashMap#get(java.lang.Object)} method returns\n     * {@code null} if the {@code Map} contains {@code null} or if there is\n     * no matching key. The {@code Null} placeholder can be used to distinguish\n     * between these two cases.\u003c/p\u003e\n     *\n     * \u003cp\u003eAnother example is {@code Hashtable}, where {@code null}\n     * cannot be stored.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 502,
      "end_line": 502,
      "comment": "\n         * Required for serialization support. Declare serialization compatibility with Commons Lang 1.0\n         *\n         * @see java.io.Serializable\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.ObjectUtils.Null.Null()",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\n         * Restricted constructor - singleton.\n         ",
      "child_ranges": [
        "(line 508,col 13)-(line 508,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ObjectUtils.Null.readResolve()",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n         * \u003cp\u003eEnsure singleton.\u003c/p\u003e\n         *\n         * @return the singleton value\n         ",
      "child_ranges": [
        "(line 517,col 13)-(line 517,col 36)"
      ]
    }
  ]
}