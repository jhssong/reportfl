{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrSubstitutor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 103,
      "end_line": 926,
      "comment": "\n * Substitutes variables within a string by values.\n * \u003cp\u003e\n * This class takes a piece of text and substitutes all the variables within it.\n * The default definition of a variable is \u003ccode\u003e${variableName}\u003c/code\u003e.\n * The prefix and suffix can be changed via constructors and set methods.\n * \u003cp\u003e\n * Variable values are typically resolved from a map, but could also be resolved\n * from system properties, or by supplying a custom variable resolver.\n * \u003cp\u003e\n * The simplest example is to use this class to replace Java System properties. For example:\n * \u003cpre\u003e\n * StrSubstitutor.replaceSystemProperties(\n *      \"You are running with java.version \u003d ${java.version} and os.name \u003d ${os.name}.\");\n * \u003c/pre\u003e\n * \u003cp\u003e\n * Typical usage of this class follows the following pattern: First an instance is created\n * and initialized with the map that contains the values for the available variables.\n * If a prefix and/or suffix for variables should be used other than the default ones,\n * the appropriate settings can be performed. After that the \u003ccode\u003ereplace()\u003c/code\u003e\n * method can be called passing in the source text for interpolation. In the returned\n * text all variable references (as long as their values are known) will be resolved.\n * The following example demonstrates this:\n * \u003cpre\u003e\n * Map valuesMap \u003d HashMap();\n * valuesMap.put(\u0026quot;animal\u0026quot;, \u0026quot;quick brown fox\u0026quot;);\n * valuesMap.put(\u0026quot;target\u0026quot;, \u0026quot;lazy dog\u0026quot;);\n * String templateString \u003d \u0026quot;The ${animal} jumped over the ${target}.\u0026quot;;\n * StrSubstitutor sub \u003d new StrSubstitutor(valuesMap);\n * String resolvedString \u003d sub.replace(templateString);\n * \u003c/pre\u003e\n * yielding:\n * \u003cpre\u003e\n *      The quick brown fox jumped over the lazy dog.\n * \u003c/pre\u003e\n * \u003cp\u003e\n * In addition to this usage pattern there are some static convenience methods that\n * cover the most common use cases. These methods can be used without the need of\n * manually creating an instance. However if multiple replace operations are to be\n * performed, creating and reusing an instance of this class will be more efficient.\n * \u003cp\u003e\n * Variable replacement works in a recursive way. Thus, if a variable value contains\n * a variable then that variable will also be replaced. Cyclic replacements are\n * detected and will cause an exception to be thrown.\n * \u003cp\u003e\n * Sometimes the interpolation\u0027s result must contain a variable prefix. As an example\n * take the following source text:\n * \u003cpre\u003e\n *   The variable ${${name}} must be used.\n * \u003c/pre\u003e\n * Here only the variable\u0027s name referred to in the text should be replaced resulting\n * in the text (assuming that the value of the \u003ccode\u003ename\u003c/code\u003e variable is \u003ccode\u003ex\u003c/code\u003e):\n * \u003cpre\u003e\n *   The variable ${x} must be used.\n * \u003c/pre\u003e\n * To achieve this effect there are two possibilities: Either set a different prefix\n * and suffix for variables which do not conflict with the result text you want to\n * produce. The other possibility is to use the escape character, by default \u0027$\u0027.\n * If this character is placed before a variable reference, this reference is ignored\n * and won\u0027t be replaced. For example:\n * \u003cpre\u003e\n *   The variable $${${name}} must be used.\n * \u003c/pre\u003e\n * \u003cp\u003e\n * In some complex scenarios you might even want to perform substitution in the\n * names of variables, for instance\n * \u003cpre\u003e\n * ${jre-${java.specification.version}}\n * \u003c/pre\u003e\n * \u003ccode\u003eStrSubstitutor\u003c/code\u003e supports this recursive substitution in variable\n * names, but it has to be enabled explicitly by setting the\n * {@link #setEnableSubstitutionInVariables(boolean) enableSubstitutionInVariables}\n * property to \u003cb\u003etrue\u003c/b\u003e.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ESCAPE"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Constant for the default escape character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Constant for the default variable prefix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Constant for the default variable suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "escapeChar"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Stores the escape character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "prefixMatcher"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Stores the variable prefix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "suffixMatcher"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Stores the variable suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "variableResolver"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Variable resolution is delegated to an implementor of VariableResolver.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "enableSubstitutionInVariables"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * The flag whether substitution in variable names is enabled.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object, java.util.Map\u003cjava.lang.String, V\u003e)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the map.\n     *\n     * @param \u003cV\u003e the type of the values in the map\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @param valueMap  the map with the values, may be null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object, java.util.Map\u003cjava.lang.String, V\u003e, java.lang.String, java.lang.String)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the map. This method allows to specifiy a\n     * custom variable prefix and suffix\n     *\n     * @param \u003cV\u003e the type of the values in the map\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @param valueMap  the map with the values, may be null\n     * @param prefix  the prefix of variables, not null\n     * @param suffix  the suffix of variables, not null\n     * @return the result of the replace operation\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object, java.util.Properties)",
      "begin_line": 178,
      "end_line": 190,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with their matching\n     * values from the properties.\n     *\n     * @param source the source text containing the variables to substitute, null returns null\n     * @param valueProperties the properties with values, may be null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 67)",
        "(line 183,col 9)-(line 183,col 67)",
        "(line 184,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties(java.lang.Object)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the system properties.\n     *\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Creates a new instance with defaults for variable prefix and suffix\n     * and the escaping character.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 82)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(java.util.Map\u003cjava.lang.String, V\u003e)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Creates a new instance and initializes it. Uses defaults for variable\n     * prefix and suffix and the escaping character.\n     *\n     * @param \u003cV\u003e the type of the values in the map\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(java.util.Map\u003cjava.lang.String, V\u003e, java.lang.String, java.lang.String)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Creates a new instance and initializes it. Uses a default escaping character.\n     *\n     * @param \u003cV\u003e the type of the values in the map\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(java.util.Map\u003cjava.lang.String, V\u003e, java.lang.String, java.lang.String, char)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param \u003cV\u003e the type of the values in the map\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang3.text.StrLookup\u003c?\u003e)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang3.text.StrLookup\u003c?\u003e, java.lang.String, java.lang.String, char)",
      "begin_line": 268,
      "end_line": 273,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 51)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang3.text.StrLookup\u003c?\u003e, org.apache.commons.lang3.text.StrMatcher, org.apache.commons.lang3.text.StrMatcher, char)",
      "begin_line": 284,
      "end_line": 290,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     * @param prefixMatcher  the prefix for variables, not null\n     * @param suffixMatcher  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 51)",
        "(line 287,col 9)-(line 287,col 53)",
        "(line 288,col 9)-(line 288,col 53)",
        "(line 289,col 9)-(line 289,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.String)",
      "begin_line": 300,
      "end_line": 309,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source string as a template.\n     *\n     * @param source  the string to replace in, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 48)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.String, int, int)",
      "begin_line": 323,
      "end_line": 332,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source string as a template.\n     * \u003cp\u003e\n     * Only the specified portion of the string will be processed.\n     * The rest of the string is not processed, and is not returned.\n     *\n     * @param source  the string to replace in, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 79)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(char[])",
      "begin_line": 343,
      "end_line": 350,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source array as a template.\n     * The array is not altered by this method.\n     *\n     * @param source  the character array to replace in, not altered, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 70)",
        "(line 348,col 9)-(line 348,col 42)",
        "(line 349,col 9)-(line 349,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(char[], int, int)",
      "begin_line": 365,
      "end_line": 372,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source array as a template.\n     * The array is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the array will be processed.\n     * The rest of the array is not processed, and is not returned.\n     *\n     * @param source  the character array to replace in, not altered, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 79)",
        "(line 370,col 9)-(line 370,col 35)",
        "(line 371,col 9)-(line 371,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.StringBuffer)",
      "begin_line": 383,
      "end_line": 390,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source buffer as a template.\n     * The buffer is not altered by this method.\n     *\n     * @param source  the buffer to use as a template, not changed, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 72)",
        "(line 388,col 9)-(line 388,col 41)",
        "(line 389,col 9)-(line 389,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.StringBuffer, int, int)",
      "begin_line": 405,
      "end_line": 412,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source buffer as a template.\n     * The buffer is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, and is not returned.\n     *\n     * @param source  the buffer to use as a template, not changed, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 79)",
        "(line 410,col 9)-(line 410,col 35)",
        "(line 411,col 9)-(line 411,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 423,
      "end_line": 430,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source builder as a template.\n     * The builder is not altered by this method.\n     *\n     * @param source  the builder to use as a template, not changed, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 72)",
        "(line 428,col 9)-(line 428,col 41)",
        "(line 429,col 9)-(line 429,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 445,
      "end_line": 452,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source builder as a template.\n     * The builder is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the builder will be processed.\n     * The rest of the builder is not processed, and is not returned.\n     *\n     * @param source  the builder to use as a template, not changed, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 79)",
        "(line 450,col 9)-(line 450,col 35)",
        "(line 451,col 9)-(line 451,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object)",
      "begin_line": 463,
      "end_line": 470,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the resolver. The input source object is\n     * converted to a string using \u003ccode\u003etoString\u003c/code\u003e and is not altered.\n     *\n     * @param source  the source to replace in, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 57)",
        "(line 468,col 9)-(line 468,col 41)",
        "(line 469,col 9)-(line 469,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(java.lang.StringBuffer)",
      "begin_line": 481,
      "end_line": 486,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(java.lang.StringBuffer, int, int)",
      "begin_line": 501,
      "end_line": 511,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, but it is not deleted.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the buffer to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 79)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 64)",
        "(line 510,col 9)-(line 510,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 521,
      "end_line": 526,
      "comment": "\n     * Replaces all the occurrences of variables within the given source\n     * builder with their matching values from the resolver.\n     *\n     * @param source  the builder to replace in, updated, null returns zero\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 540,
      "end_line": 545,
      "comment": "\n     * Replaces all the occurrences of variables within the given source\n     * builder with their matching values from the resolver.\n     * \u003cp\u003e\n     * Only the specified portion of the builder will be processed.\n     * The rest of the builder is not processed, but it is not deleted.\n     *\n     * @param source  the builder to replace in, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.substitute(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 562,
      "end_line": 564,
      "comment": "\n     * Internal method that substitutes the variables.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method will\n     * be called automatically by another (public) method.\n     * \u003cp\u003e\n     * Writers of subclasses can override this method if they need access to\n     * the substitution process at the start or end.\n     *\n     * @param buf  the string builder to substitute into, not null\n     * @param offset  the start offset within the builder, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.substitute(org.apache.commons.lang3.text.StrBuilder, int, int, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 578,
      "end_line": 684,
      "comment": "\n     * Recursive handler for multiple levels of interpolation. This is the main\n     * interpolation method, which resolves the values of all variable references\n     * contained in the passed in text.\n     *\n     * @param buf  the string builder to substitute into, not null\n     * @param offset  the start offset within the builder, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @param priorVariables  the stack keeping track of the replaced variables, may be null\n     * @return the length change that occurs, unless priorVariables is null when the int\n     *  represents a boolean flag as to whether any change occurred.\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 62)",
        "(line 580,col 9)-(line 580,col 62)",
        "(line 581,col 9)-(line 581,col 38)",
        "(line 583,col 9)-(line 583,col 47)",
        "(line 584,col 9)-(line 584,col 32)",
        "(line 585,col 9)-(line 585,col 29)",
        "(line 586,col 9)-(line 586,col 34)",
        "(line 587,col 9)-(line 587,col 37)",
        "(line 588,col 9)-(line 588,col 25)",
        "(line 589,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 683,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.checkCyclicSubstitution(java.lang.String, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 692,
      "end_line": 702,
      "comment": "\n     * Checks if the specified variable is already in the stack (list) of variables.\n     *\n     * @param varName  the variable name to check\n     * @param priorVariables  the list of prior variables\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 45)",
        "(line 697,col 9)-(line 697,col 66)",
        "(line 698,col 9)-(line 698,col 45)",
        "(line 699,col 9)-(line 699,col 25)",
        "(line 700,col 9)-(line 700,col 55)",
        "(line 701,col 9)-(line 701,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.resolveVariable(java.lang.String, org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 721,
      "end_line": 727,
      "comment": "\n     * Internal method that resolves the value of a variable.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method is\n     * called automatically by the substitution process.\n     * \u003cp\u003e\n     * Writers of subclasses can override this method if they need to alter\n     * how each substitution occurs. The method is passed the variable\u0027s name\n     * and must return the corresponding value. This implementation uses the\n     * {@link #getVariableResolver()} with the variable\u0027s name as the key.\n     *\n     * @param variableName  the name of the variable, not null\n     * @param buf  the buffer where the substitution is occurring, not null\n     * @param startPos  the start position of the variable including the prefix, valid\n     * @param endPos  the end position of the variable including the suffix, valid\n     * @return the variable\u0027s value or \u003cb\u003enull\u003c/b\u003e if the variable is unknown\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 54)",
        "(line 723,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getEscapeChar()",
      "begin_line": 736,
      "end_line": 738,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the character used for escaping variable references\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setEscapeChar(char)",
      "begin_line": 747,
      "end_line": 749,
      "comment": "\n     * Sets the escape character.\n     * If this character is placed before a variable reference in the source\n     * text, this variable will be ignored.\n     *\n     * @param escapeCharacter  the escape character (0 for disabling escaping)\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariablePrefixMatcher()",
      "begin_line": 762,
      "end_line": 764,
      "comment": "\n     * Gets the variable prefix matcher currently in use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This prefix is expressed in terms of a matcher\n     * allowing advanced prefix matches.\n     *\n     * @return the prefix matcher in use\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 777,
      "end_line": 783,
      "comment": "\n     * Sets the variable prefix matcher currently in use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This prefix is expressed in terms of a matcher\n     * allowing advanced prefix matches.\n     *\n     * @param prefixMatcher  the prefix matcher to use, null ignored\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the prefix matcher is null\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 43)",
        "(line 782,col 9)-(line 782,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefix(char)",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\n     * Sets the variable prefix to use.\n     * \u003cp\u003e\n     * The variable prefix is the character or characters that identify the\n     * start of a variable. This method allows a single character prefix to\n     * be easily set.\n     *\n     * @param prefix  the prefix character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefix(java.lang.String)",
      "begin_line": 809,
      "end_line": 814,
      "comment": "\n     * Sets the variable prefix to use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This method allows a string prefix to be easily set.\n     *\n     * @param prefix  the prefix for variables, not null\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the prefix is null\n     ",
      "child_ranges": [
        "(line 810,col 8)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariableSuffixMatcher()",
      "begin_line": 827,
      "end_line": 829,
      "comment": "\n     * Gets the variable suffix matcher currently in use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This suffix is expressed in terms of a matcher\n     * allowing advanced suffix matches.\n     *\n     * @return the suffix matcher in use\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 842,
      "end_line": 848,
      "comment": "\n     * Sets the variable suffix matcher currently in use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This suffix is expressed in terms of a matcher\n     * allowing advanced suffix matches.\n     *\n     * @param suffixMatcher  the suffix matcher to use, null ignored\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the suffix matcher is null\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 846,col 43)",
        "(line 847,col 9)-(line 847,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffix(char)",
      "begin_line": 860,
      "end_line": 862,
      "comment": "\n     * Sets the variable suffix to use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This method allows a single character suffix to\n     * be easily set.\n     *\n     * @param suffix  the suffix character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 861,col 9)-(line 861,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffix(java.lang.String)",
      "begin_line": 874,
      "end_line": 879,
      "comment": "\n     * Sets the variable suffix to use.\n     * \u003cp\u003e\n     * The variable suffix is the character or characters that identify the\n     * end of a variable. This method allows a string suffix to be easily set.\n     *\n     * @param suffix  the suffix for variables, not null\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the suffix is null\n     ",
      "child_ranges": [
        "(line 875,col 8)-(line 877,col 9)",
        "(line 878,col 9)-(line 878,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariableResolver()",
      "begin_line": 888,
      "end_line": 890,
      "comment": "\n     * Gets the VariableResolver that is used to lookup variables.\n     *\n     * @return the VariableResolver\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableResolver(org.apache.commons.lang3.text.StrLookup\u003c?\u003e)",
      "begin_line": 897,
      "end_line": 899,
      "comment": "\n     * Sets the VariableResolver that is used to lookup variables.\n     *\n     * @param variableResolver  the VariableResolver\n     ",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.isEnableSubstitutionInVariables()",
      "begin_line": 909,
      "end_line": 911,
      "comment": "\n     * Returns a flag whether substitution is done in variable names.\n     *\n     * @return the substitution in variable names flag\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setEnableSubstitutionInVariables(boolean)",
      "begin_line": 922,
      "end_line": 925,
      "comment": "\n     * Sets a flag whether substitution is done in variable names. If set to\n     * \u003cb\u003etrue\u003c/b\u003e, the names of variables can contain other variables which are\n     * processed first before the original variable is evaluated, e.g.\n     * \u003ccode\u003e${jre-${java.version}}\u003c/code\u003e. The default value is \u003cb\u003efalse\u003c/b\u003e.\n     *\n     * @param enableSubstitutionInVariables the new value of the flag\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 75)"
      ]
    }
  ]
}