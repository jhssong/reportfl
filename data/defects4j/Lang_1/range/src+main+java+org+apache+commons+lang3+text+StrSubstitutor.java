{
  "filepath": "/tmp/Lang-1b/src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrSubstitutor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 103,
      "end_line": 1008,
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
        "(line 182,col 9)-(line 182,col 73)",
        "(line 183,col 9)-(line 183,col 73)",
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
        "(line 304,col 9)-(line 304,col 54)",
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
        "(line 327,col 9)-(line 327,col 85)",
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
        "(line 347,col 9)-(line 347,col 76)",
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
        "(line 369,col 9)-(line 369,col 85)",
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
        "(line 387,col 9)-(line 387,col 78)",
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
        "(line 409,col 9)-(line 409,col 85)",
        "(line 410,col 9)-(line 410,col 35)",
        "(line 411,col 9)-(line 411,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.CharSequence)",
      "begin_line": 423,
      "end_line": 428,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source as a template.\n     * The source is not altered by this method.\n     *\n     * @param source  the buffer to use as a template, not changed, null returns null\n     * @return the result of the replace operation\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.CharSequence, int, int)",
      "begin_line": 444,
      "end_line": 451,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source as a template.\n     * The source is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, and is not returned.\n     *\n     * @param source  the buffer to use as a template, not changed, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 79)",
        "(line 449,col 9)-(line 449,col 35)",
        "(line 450,col 9)-(line 450,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 462,
      "end_line": 469,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source builder as a template.\n     * The builder is not altered by this method.\n     *\n     * @param source  the builder to use as a template, not changed, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 78)",
        "(line 467,col 9)-(line 467,col 41)",
        "(line 468,col 9)-(line 468,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 484,
      "end_line": 491,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source builder as a template.\n     * The builder is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the builder will be processed.\n     * The rest of the builder is not processed, and is not returned.\n     *\n     * @param source  the builder to use as a template, not changed, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 85)",
        "(line 489,col 9)-(line 489,col 35)",
        "(line 490,col 9)-(line 490,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object)",
      "begin_line": 502,
      "end_line": 509,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the resolver. The input source object is\n     * converted to a string using \u003ccode\u003etoString\u003c/code\u003e and is not altered.\n     *\n     * @param source  the source to replace in, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 63)",
        "(line 507,col 9)-(line 507,col 41)",
        "(line 508,col 9)-(line 508,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(java.lang.StringBuffer)",
      "begin_line": 520,
      "end_line": 525,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(java.lang.StringBuffer, int, int)",
      "begin_line": 540,
      "end_line": 550,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, but it is not deleted.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the buffer to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 85)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 64)",
        "(line 549,col 9)-(line 549,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(java.lang.StringBuilder)",
      "begin_line": 562,
      "end_line": 567,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @return true if altered\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(java.lang.StringBuilder, int, int)",
      "begin_line": 583,
      "end_line": 593,
      "comment": "\n     * Replaces all the occurrences of variables within the given source builder\n     * with their matching values from the resolver.\n     * The builder is updated with the result.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, but it is not deleted.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the buffer to be processed, must be valid\n     * @return true if altered\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 79)",
        "(line 588,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 64)",
        "(line 592,col 9)-(line 592,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 603,
      "end_line": 608,
      "comment": "\n     * Replaces all the occurrences of variables within the given source\n     * builder with their matching values from the resolver.\n     *\n     * @param source  the builder to replace in, updated, null returns zero\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 622,
      "end_line": 627,
      "comment": "\n     * Replaces all the occurrences of variables within the given source\n     * builder with their matching values from the resolver.\n     * \u003cp\u003e\n     * Only the specified portion of the builder will be processed.\n     * The rest of the builder is not processed, but it is not deleted.\n     *\n     * @param source  the builder to replace in, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.substitute(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 644,
      "end_line": 646,
      "comment": "\n     * Internal method that substitutes the variables.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method will\n     * be called automatically by another (public) method.\n     * \u003cp\u003e\n     * Writers of subclasses can override this method if they need access to\n     * the substitution process at the start or end.\n     *\n     * @param buf  the string builder to substitute into, not null\n     * @param offset  the start offset within the builder, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.substitute(org.apache.commons.lang3.text.StrBuilder, int, int, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 660,
      "end_line": 766,
      "comment": "\n     * Recursive handler for multiple levels of interpolation. This is the main\n     * interpolation method, which resolves the values of all variable references\n     * contained in the passed in text.\n     *\n     * @param buf  the string builder to substitute into, not null\n     * @param offset  the start offset within the builder, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @param priorVariables  the stack keeping track of the replaced variables, may be null\n     * @return the length change that occurs, unless priorVariables is null when the int\n     *  represents a boolean flag as to whether any change occurred.\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 68)",
        "(line 662,col 9)-(line 662,col 68)",
        "(line 663,col 9)-(line 663,col 44)",
        "(line 665,col 9)-(line 665,col 51)",
        "(line 666,col 9)-(line 666,col 32)",
        "(line 667,col 9)-(line 667,col 29)",
        "(line 668,col 9)-(line 668,col 34)",
        "(line 669,col 9)-(line 669,col 37)",
        "(line 670,col 9)-(line 670,col 25)",
        "(line 671,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 765,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.checkCyclicSubstitution(java.lang.String, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 774,
      "end_line": 784,
      "comment": "\n     * Checks if the specified variable is already in the stack (list) of variables.\n     *\n     * @param varName  the variable name to check\n     * @param priorVariables  the list of prior variables\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 778,col 51)",
        "(line 779,col 9)-(line 779,col 66)",
        "(line 780,col 9)-(line 780,col 45)",
        "(line 781,col 9)-(line 781,col 25)",
        "(line 782,col 9)-(line 782,col 55)",
        "(line 783,col 9)-(line 783,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.resolveVariable(java.lang.String, org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 803,
      "end_line": 809,
      "comment": "\n     * Internal method that resolves the value of a variable.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method is\n     * called automatically by the substitution process.\n     * \u003cp\u003e\n     * Writers of subclasses can override this method if they need to alter\n     * how each substitution occurs. The method is passed the variable\u0027s name\n     * and must return the corresponding value. This implementation uses the\n     * {@link #getVariableResolver()} with the variable\u0027s name as the key.\n     *\n     * @param variableName  the name of the variable, not null\n     * @param buf  the buffer where the substitution is occurring, not null\n     * @param startPos  the start position of the variable including the prefix, valid\n     * @param endPos  the end position of the variable including the suffix, valid\n     * @return the variable\u0027s value or \u003cb\u003enull\u003c/b\u003e if the variable is unknown\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 60)",
        "(line 805,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getEscapeChar()",
      "begin_line": 818,
      "end_line": 820,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the character used for escaping variable references\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setEscapeChar(char)",
      "begin_line": 829,
      "end_line": 831,
      "comment": "\n     * Sets the escape character.\n     * If this character is placed before a variable reference in the source\n     * text, this variable will be ignored.\n     *\n     * @param escapeCharacter  the escape character (0 for disabling escaping)\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariablePrefixMatcher()",
      "begin_line": 844,
      "end_line": 846,
      "comment": "\n     * Gets the variable prefix matcher currently in use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This prefix is expressed in terms of a matcher\n     * allowing advanced prefix matches.\n     *\n     * @return the prefix matcher in use\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 859,
      "end_line": 865,
      "comment": "\n     * Sets the variable prefix matcher currently in use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This prefix is expressed in terms of a matcher\n     * allowing advanced prefix matches.\n     *\n     * @param prefixMatcher  the prefix matcher to use, null ignored\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the prefix matcher is null\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 863,col 43)",
        "(line 864,col 9)-(line 864,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefix(char)",
      "begin_line": 877,
      "end_line": 879,
      "comment": "\n     * Sets the variable prefix to use.\n     * \u003cp\u003e\n     * The variable prefix is the character or characters that identify the\n     * start of a variable. This method allows a single character prefix to\n     * be easily set.\n     *\n     * @param prefix  the prefix character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefix(java.lang.String)",
      "begin_line": 891,
      "end_line": 896,
      "comment": "\n     * Sets the variable prefix to use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This method allows a string prefix to be easily set.\n     *\n     * @param prefix  the prefix for variables, not null\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the prefix is null\n     ",
      "child_ranges": [
        "(line 892,col 8)-(line 894,col 9)",
        "(line 895,col 9)-(line 895,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariableSuffixMatcher()",
      "begin_line": 909,
      "end_line": 911,
      "comment": "\n     * Gets the variable suffix matcher currently in use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This suffix is expressed in terms of a matcher\n     * allowing advanced suffix matches.\n     *\n     * @return the suffix matcher in use\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 924,
      "end_line": 930,
      "comment": "\n     * Sets the variable suffix matcher currently in use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This suffix is expressed in terms of a matcher\n     * allowing advanced suffix matches.\n     *\n     * @param suffixMatcher  the suffix matcher to use, null ignored\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the suffix matcher is null\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 928,col 43)",
        "(line 929,col 9)-(line 929,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffix(char)",
      "begin_line": 942,
      "end_line": 944,
      "comment": "\n     * Sets the variable suffix to use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This method allows a single character suffix to\n     * be easily set.\n     *\n     * @param suffix  the suffix character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffix(java.lang.String)",
      "begin_line": 956,
      "end_line": 961,
      "comment": "\n     * Sets the variable suffix to use.\n     * \u003cp\u003e\n     * The variable suffix is the character or characters that identify the\n     * end of a variable. This method allows a string suffix to be easily set.\n     *\n     * @param suffix  the suffix for variables, not null\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the suffix is null\n     ",
      "child_ranges": [
        "(line 957,col 8)-(line 959,col 9)",
        "(line 960,col 9)-(line 960,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariableResolver()",
      "begin_line": 970,
      "end_line": 972,
      "comment": "\n     * Gets the VariableResolver that is used to lookup variables.\n     *\n     * @return the VariableResolver\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableResolver(org.apache.commons.lang3.text.StrLookup\u003c?\u003e)",
      "begin_line": 979,
      "end_line": 981,
      "comment": "\n     * Sets the VariableResolver that is used to lookup variables.\n     *\n     * @param variableResolver  the VariableResolver\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.isEnableSubstitutionInVariables()",
      "begin_line": 991,
      "end_line": 993,
      "comment": "\n     * Returns a flag whether substitution is done in variable names.\n     *\n     * @return the substitution in variable names flag\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setEnableSubstitutionInVariables(boolean)",
      "begin_line": 1004,
      "end_line": 1007,
      "comment": "\n     * Sets a flag whether substitution is done in variable names. If set to\n     * \u003cb\u003etrue\u003c/b\u003e, the names of variables can contain other variables which are\n     * processed first before the original variable is evaluated, e.g.\n     * \u003ccode\u003e${jre-${java.version}}\u003c/code\u003e. The default value is \u003cb\u003efalse\u003c/b\u003e.\n     *\n     * @param enableSubstitutionInVariables the new value of the flag\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 75)"
      ]
    }
  ]
}