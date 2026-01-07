{
  "filepath": "/tmp/Lang-25b/src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrSubstitutor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 104,
      "end_line": 924,
      "comment": "\n * Substitutes variables within a string by values.\n * \u003cp\u003e\n * This class takes a piece of text and substitutes all the variables within it.\n * The default definition of a variable is \u003ccode\u003e${variableName}\u003c/code\u003e.\n * The prefix and suffix can be changed via constructors and set methods.\n * \u003cp\u003e\n * Variable values are typically resolved from a map, but could also be resolved\n * from system properties, or by supplying a custom variable resolver.\n * \u003cp\u003e\n * The simplest example is to use this class to replace Java System properties. For example:\n * \u003cpre\u003e\n * StrSubstitutor.replaceSystemProperties(\n *      \"You are running with java.version \u003d ${java.version} and os.name \u003d ${os.name}.\");\n * \u003c/pre\u003e\n * \u003cp\u003e\n * Typical usage of this class follows the following pattern: First an instance is created\n * and initialized with the map that contains the values for the available variables.\n * If a prefix and/or suffix for variables should be used other than the default ones,\n * the appropriate settings can be performed. After that the \u003ccode\u003ereplace()\u003c/code\u003e\n * method can be called passing in the source text for interpolation. In the returned\n * text all variable references (as long as their values are known) will be resolved.\n * The following example demonstrates this:\n * \u003cpre\u003e\n * Map valuesMap \u003d HashMap();\n * valuesMap.put(\u0026quot;animal\u0026quot;, \u0026quot;quick brown fox\u0026quot;);\n * valuesMap.put(\u0026quot;target\u0026quot;, \u0026quot;lazy dog\u0026quot;);\n * String templateString \u003d \u0026quot;The ${animal} jumped over the ${target}.\u0026quot;;\n * StrSubstitutor sub \u003d new StrSubstitutor(valuesMap);\n * String resolvedString \u003d sub.replace(templateString);\n * \u003c/pre\u003e\n * yielding:\n * \u003cpre\u003e\n *      The quick brown fox jumped over the lazy dog.\n * \u003c/pre\u003e\n * \u003cp\u003e\n * In addition to this usage pattern there are some static convenience methods that\n * cover the most common use cases. These methods can be used without the need of\n * manually creating an instance. However if multiple replace operations are to be\n * performed, creating and reusing an instance of this class will be more efficient.\n * \u003cp\u003e\n * Variable replacement works in a recursive way. Thus, if a variable value contains\n * a variable then that variable will also be replaced. Cyclic replacements are\n * detected and will cause an exception to be thrown.\n * \u003cp\u003e\n * Sometimes the interpolation\u0027s result must contain a variable prefix. As an example\n * take the following source text:\n * \u003cpre\u003e\n *   The variable ${${name}} must be used.\n * \u003c/pre\u003e\n * Here only the variable\u0027s name referred to in the text should be replaced resulting\n * in the text (assuming that the value of the \u003ccode\u003ename\u003c/code\u003e variable is \u003ccode\u003ex\u003c/code\u003e):\n * \u003cpre\u003e\n *   The variable ${x} must be used.\n * \u003c/pre\u003e\n * To achieve this effect there are two possibilities: Either set a different prefix\n * and suffix for variables which do not conflict with the result text you want to\n * produce. The other possibility is to use the escape character, by default \u0027$\u0027.\n * If this character is placed before a variable reference, this reference is ignored\n * and won\u0027t be replaced. For example:\n * \u003cpre\u003e\n *   The variable $${${name}} must be used.\n * \u003c/pre\u003e\n * \u003cp\u003e\n * In some complex scenarios you might even want to perform substitution in the\n * names of variables, for instance\n * \u003cpre\u003e\n * ${jre-${java.specification.version}}\n * \u003c/pre\u003e\n * \u003ccode\u003eStrSubstitutor\u003c/code\u003e supports this recursive substitution in variable\n * names, but it has to be enabled explicitly by setting the\n * {@link #setEnableSubstitutionInVariables(boolean) enableSubstitutionInVariables}\n * property to \u003cb\u003etrue\u003c/b\u003e.\n *\n * @author Apache Software Foundation\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ESCAPE"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Constant for the default escape character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Constant for the default variable prefix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Constant for the default variable suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "escapeChar"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Stores the escape character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "prefixMatcher"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Stores the variable prefix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "suffixMatcher"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Stores the variable suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "variableResolver"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Variable resolution is delegated to an implementor of VariableResolver.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "enableSubstitutionInVariables"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * The flag whether substitution in variable names is enabled.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object, java.util.Map\u003cjava.lang.String, V\u003e)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the map.\n     *\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @param valueMap  the map with the values, may be null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object, java.util.Map\u003cjava.lang.String, V\u003e, java.lang.String, java.lang.String)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the map. This method allows to specifiy a\n     * custom variable prefix and suffix\n     *\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @param valueMap  the map with the values, may be null\n     * @param prefix  the prefix of variables, not null\n     * @param suffix  the suffix of variables, not null\n     * @return the result of the replace operation\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object, java.util.Properties)",
      "begin_line": 177,
      "end_line": 191,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with their matching\n     * values from the properties.\n     *\n     * @param source the source text containing the variables to substitute, null returns null\n     * @param valueProperties the properties with values, may be null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 67)",
        "(line 183,col 9)-(line 183,col 67)",
        "(line 184,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceSystemProperties(java.lang.Object)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the system properties.\n     *\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Creates a new instance with defaults for variable prefix and suffix\n     * and the escaping character.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 82)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(java.util.Map\u003cjava.lang.String, V\u003e)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Creates a new instance and initializes it. Uses defaults for variable\n     * prefix and suffix and the escaping character.\n     *\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(java.util.Map\u003cjava.lang.String, V\u003e, java.lang.String, java.lang.String)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Creates a new instance and initializes it. Uses a default escaping character.\n     *\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(java.util.Map\u003cjava.lang.String, V\u003e, java.lang.String, java.lang.String, char)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang3.text.StrLookup\u003c?\u003e)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang3.text.StrLookup\u003c?\u003e, java.lang.String, java.lang.String, char)",
      "begin_line": 266,
      "end_line": 271,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 51)",
        "(line 268,col 9)-(line 268,col 39)",
        "(line 269,col 9)-(line 269,col 39)",
        "(line 270,col 9)-(line 270,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang3.text.StrLookup\u003c?\u003e, org.apache.commons.lang3.text.StrMatcher, org.apache.commons.lang3.text.StrMatcher, char)",
      "begin_line": 282,
      "end_line": 288,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     * @param prefixMatcher  the prefix for variables, not null\n     * @param suffixMatcher  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 51)",
        "(line 285,col 9)-(line 285,col 53)",
        "(line 286,col 9)-(line 286,col 53)",
        "(line 287,col 9)-(line 287,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.String)",
      "begin_line": 298,
      "end_line": 307,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source string as a template.\n     *\n     * @param source  the string to replace in, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 48)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.String, int, int)",
      "begin_line": 321,
      "end_line": 330,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source string as a template.\n     * \u003cp\u003e\n     * Only the specified portion of the string will be processed.\n     * The rest of the string is not processed, and is not returned.\n     *\n     * @param source  the string to replace in, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 79)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(char[])",
      "begin_line": 341,
      "end_line": 348,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source array as a template.\n     * The array is not altered by this method.\n     *\n     * @param source  the character array to replace in, not altered, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 70)",
        "(line 346,col 9)-(line 346,col 42)",
        "(line 347,col 9)-(line 347,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(char[], int, int)",
      "begin_line": 363,
      "end_line": 370,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source array as a template.\n     * The array is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the array will be processed.\n     * The rest of the array is not processed, and is not returned.\n     *\n     * @param source  the character array to replace in, not altered, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 79)",
        "(line 368,col 9)-(line 368,col 35)",
        "(line 369,col 9)-(line 369,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.StringBuffer)",
      "begin_line": 381,
      "end_line": 388,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source buffer as a template.\n     * The buffer is not altered by this method.\n     *\n     * @param source  the buffer to use as a template, not changed, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 72)",
        "(line 386,col 9)-(line 386,col 41)",
        "(line 387,col 9)-(line 387,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.StringBuffer, int, int)",
      "begin_line": 403,
      "end_line": 410,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source buffer as a template.\n     * The buffer is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, and is not returned.\n     *\n     * @param source  the buffer to use as a template, not changed, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 79)",
        "(line 408,col 9)-(line 408,col 35)",
        "(line 409,col 9)-(line 409,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 421,
      "end_line": 428,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source builder as a template.\n     * The builder is not altered by this method.\n     *\n     * @param source  the builder to use as a template, not changed, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 72)",
        "(line 426,col 9)-(line 426,col 41)",
        "(line 427,col 9)-(line 427,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 443,
      "end_line": 450,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source builder as a template.\n     * The builder is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the builder will be processed.\n     * The rest of the builder is not processed, and is not returned.\n     *\n     * @param source  the builder to use as a template, not changed, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 79)",
        "(line 448,col 9)-(line 448,col 35)",
        "(line 449,col 9)-(line 449,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replace(java.lang.Object)",
      "begin_line": 461,
      "end_line": 468,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the resolver. The input source object is\n     * converted to a string using \u003ccode\u003etoString\u003c/code\u003e and is not altered.\n     *\n     * @param source  the source to replace in, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 57)",
        "(line 466,col 9)-(line 466,col 41)",
        "(line 467,col 9)-(line 467,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(java.lang.StringBuffer)",
      "begin_line": 479,
      "end_line": 484,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(java.lang.StringBuffer, int, int)",
      "begin_line": 499,
      "end_line": 509,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, but it is not deleted.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the buffer to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 79)",
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 64)",
        "(line 508,col 9)-(line 508,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 519,
      "end_line": 524,
      "comment": "\n     * Replaces all the occurrences of variables within the given source\n     * builder with their matching values from the resolver.\n     *\n     * @param source  the builder to replace in, updated, null returns zero\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.replaceIn(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 538,
      "end_line": 543,
      "comment": "\n     * Replaces all the occurrences of variables within the given source\n     * builder with their matching values from the resolver.\n     * \u003cp\u003e\n     * Only the specified portion of the builder will be processed.\n     * The rest of the builder is not processed, but it is not deleted.\n     *\n     * @param source  the builder to replace in, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.substitute(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\n     * Internal method that substitutes the variables.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method will\n     * be called automatically by another (public) method.\n     * \u003cp\u003e\n     * Writers of subclasses can override this method if they need access to\n     * the substitution process at the start or end.\n     *\n     * @param buf  the string builder to substitute into, not null\n     * @param offset  the start offset within the builder, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.substitute(org.apache.commons.lang3.text.StrBuilder, int, int, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 576,
      "end_line": 682,
      "comment": "\n     * Recursive handler for multiple levels of interpolation. This is the main\n     * interpolation method, which resolves the values of all variable references\n     * contained in the passed in text.\n     *\n     * @param buf  the string builder to substitute into, not null\n     * @param offset  the start offset within the builder, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @param priorVariables  the stack keeping track of the replaced variables, may be null\n     * @return the length change that occurs, unless priorVariables is null when the int\n     *  represents a boolean flag as to whether any change occurred.\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 62)",
        "(line 578,col 9)-(line 578,col 62)",
        "(line 579,col 9)-(line 579,col 38)",
        "(line 581,col 9)-(line 581,col 47)",
        "(line 582,col 9)-(line 582,col 32)",
        "(line 583,col 9)-(line 583,col 29)",
        "(line 584,col 9)-(line 584,col 34)",
        "(line 585,col 9)-(line 585,col 37)",
        "(line 586,col 9)-(line 586,col 25)",
        "(line 587,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.checkCyclicSubstitution(java.lang.String, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 690,
      "end_line": 700,
      "comment": "\n     * Checks if the specified variable is already in the stack (list) of variables.\n     *\n     * @param varName  the variable name to check\n     * @param priorVariables  the list of prior variables\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 45)",
        "(line 695,col 9)-(line 695,col 66)",
        "(line 696,col 9)-(line 696,col 45)",
        "(line 697,col 9)-(line 697,col 25)",
        "(line 698,col 9)-(line 698,col 55)",
        "(line 699,col 9)-(line 699,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.resolveVariable(java.lang.String, org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 719,
      "end_line": 725,
      "comment": "\n     * Internal method that resolves the value of a variable.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method is\n     * called automatically by the substitution process.\n     * \u003cp\u003e\n     * Writers of subclasses can override this method if they need to alter\n     * how each substitution occurs. The method is passed the variable\u0027s name\n     * and must return the corresponding value. This implementation uses the\n     * {@link #getVariableResolver()} with the variable\u0027s name as the key.\n     *\n     * @param variableName  the name of the variable, not null\n     * @param buf  the buffer where the substitution is occurring, not null\n     * @param startPos  the start position of the variable including the prefix, valid\n     * @param endPos  the end position of the variable including the suffix, valid\n     * @return the variable\u0027s value or \u003cb\u003enull\u003c/b\u003e if the variable is unknown\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 54)",
        "(line 721,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 724,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getEscapeChar()",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the character used for escaping variable references\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setEscapeChar(char)",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\n     * Sets the escape character.\n     * If this character is placed before a variable reference in the source\n     * text, this variable will be ignored.\n     *\n     * @param escapeCharacter  the escape character (0 for disabling escaping)\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariablePrefixMatcher()",
      "begin_line": 760,
      "end_line": 762,
      "comment": "\n     * Gets the variable prefix matcher currently in use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This prefix is expressed in terms of a matcher\n     * allowing advanced prefix matches.\n     *\n     * @return the prefix matcher in use\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefixMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 775,
      "end_line": 781,
      "comment": "\n     * Sets the variable prefix matcher currently in use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This prefix is expressed in terms of a matcher\n     * allowing advanced prefix matches.\n     *\n     * @param prefixMatcher  the prefix matcher to use, null ignored\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the prefix matcher is null\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 779,col 43)",
        "(line 780,col 9)-(line 780,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefix(char)",
      "begin_line": 793,
      "end_line": 795,
      "comment": "\n     * Sets the variable prefix to use.\n     * \u003cp\u003e\n     * The variable prefix is the character or characters that identify the\n     * start of a variable. This method allows a single character prefix to\n     * be easily set.\n     *\n     * @param prefix  the prefix character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariablePrefix(java.lang.String)",
      "begin_line": 807,
      "end_line": 812,
      "comment": "\n     * Sets the variable prefix to use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This method allows a string prefix to be easily set.\n     *\n     * @param prefix  the prefix for variables, not null\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the prefix is null\n     ",
      "child_ranges": [
        "(line 808,col 8)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariableSuffixMatcher()",
      "begin_line": 825,
      "end_line": 827,
      "comment": "\n     * Gets the variable suffix matcher currently in use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This suffix is expressed in terms of a matcher\n     * allowing advanced suffix matches.\n     *\n     * @return the suffix matcher in use\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffixMatcher(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 840,
      "end_line": 846,
      "comment": "\n     * Sets the variable suffix matcher currently in use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This suffix is expressed in terms of a matcher\n     * allowing advanced suffix matches.\n     *\n     * @param suffixMatcher  the suffix matcher to use, null ignored\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the suffix matcher is null\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 844,col 43)",
        "(line 845,col 9)-(line 845,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffix(char)",
      "begin_line": 858,
      "end_line": 860,
      "comment": "\n     * Sets the variable suffix to use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This method allows a single character suffix to\n     * be easily set.\n     *\n     * @param suffix  the suffix character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableSuffix(java.lang.String)",
      "begin_line": 872,
      "end_line": 877,
      "comment": "\n     * Sets the variable suffix to use.\n     * \u003cp\u003e\n     * The variable suffix is the character or characters that identify the\n     * end of a variable. This method allows a string suffix to be easily set.\n     *\n     * @param suffix  the suffix for variables, not null\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the suffix is null\n     ",
      "child_ranges": [
        "(line 873,col 8)-(line 875,col 9)",
        "(line 876,col 9)-(line 876,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.getVariableResolver()",
      "begin_line": 886,
      "end_line": 888,
      "comment": "\n     * Gets the VariableResolver that is used to lookup variables.\n     *\n     * @return the VariableResolver\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setVariableResolver(org.apache.commons.lang3.text.StrLookup\u003c?\u003e)",
      "begin_line": 895,
      "end_line": 897,
      "comment": "\n     * Sets the VariableResolver that is used to lookup variables.\n     *\n     * @param variableResolver  the VariableResolver\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.isEnableSubstitutionInVariables()",
      "begin_line": 907,
      "end_line": 909,
      "comment": "\n     * Returns a flag whether substitution is done in variable names.\n     *\n     * @return the substitution in variable names flag\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutor.setEnableSubstitutionInVariables(boolean)",
      "begin_line": 920,
      "end_line": 923,
      "comment": "\n     * Sets a flag whether substitution is done in variable names. If set to\n     * \u003cb\u003etrue\u003c/b\u003e, the names of variables can contain other variables which are\n     * processed first before the original variable is evaluated, e.g.\n     * \u003ccode\u003e${jre-${java.version}}\u003c/code\u003e. The default value is \u003cb\u003efalse\u003c/b\u003e.\n     *\n     * @param enableSubstitutionInVariables the new value of the flag\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 75)"
      ]
    }
  ]
}