{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/text/StrSubstitutor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrSubstitutor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 91,
      "end_line": 829,
      "comment": "\n * Substitutes variables within a string by values.\n * \u003cp\u003e\n * This class takes a piece of text and substitutes all the variables within it.\n * The default definition of a variable is \u003ccode\u003e${variableName}\u003c/code\u003e.\n * The prefix and suffix can be changed via constructors and set methods.\n * \u003cp\u003e\n * Variable values are typically resolved from a map, but could also be resolved\n * from system properties, or by supplying a custom variable resolver.\n * \u003cp\u003e\n * The simplest example is to use this class to replace Java System properties. For example:\n * \u003cpre\u003e\n * StrSubstitutor.replaceSystemProperties(\n *      \"You are running with java.version \u003d ${java.version} and os.name \u003d ${os.name}.\");\n * \u003c/pre\u003e\n * \u003cp\u003e\n * Typical usage of this class follows the following pattern: First an instance is created\n * and initialized with the map that contains the values for the available variables.\n * If a prefix and/or suffix for variables should be used other than the default ones,\n * the appropriate settings can be performed. After that the \u003ccode\u003ereplace()\u003c/code\u003e\n * method can be called passing in the source text for interpolation. In the returned\n * text all variable references (as long as their values are known) will be resolved.\n * The following example demonstrates this:\n * \u003cpre\u003e\n * Map valuesMap \u003d HashMap();\n * valuesMap.put(\u0026quot;animal\u0026quot;, \u0026quot;quick brown fox\u0026quot;);\n * valuesMap.put(\u0026quot;target\u0026quot;, \u0026quot;lazy dog\u0026quot;);\n * String templateString \u003d \u0026quot;The ${animal} jumped over the ${target}.\u0026quot;;\n * StrSubstitutor sub \u003d new StrSubstitutor(valuesMap);\n * String resolvedString \u003d sub.replace(templateString);\n * \u003c/pre\u003e\n * yielding:\n * \u003cpre\u003e\n *      The quick brown fox jumped over the lazy dog.\n * \u003c/pre\u003e\n * \u003cp\u003e\n * In addition to this usage pattern there are some static convenience methods that\n * cover the most common use cases. These methods can be used without the need of\n * manually creating an instance. However if multiple replace operations are to be\n * performed, creating and reusing an instance of this class will be more efficient.\n * \u003cp\u003e\n * Variable replacement works in a recursive way. Thus, if a variable value contains\n * a variable then that variable will also be replaced. Cyclic replacements are\n * detected and will cause an exception to be thrown.\n * \u003cp\u003e\n * Sometimes the interpolation\u0027s result must contain a variable prefix. As an example\n * take the following source text:\n * \u003cpre\u003e\n *   The variable ${${name}} must be used.\n * \u003c/pre\u003e\n * Here only the variable\u0027s name refered to in the text should be replaced resulting\n * in the text (assuming that the value of the \u003ccode\u003ename\u003c/code\u003e variable is \u003ccode\u003ex\u003c/code\u003e):\n * \u003cpre\u003e\n *   The variable ${x} must be used.\n * \u003c/pre\u003e\n * To achieve this effect there are two possibilities: Either set a different prefix\n * and suffix for variables which do not conflict with the result text you want to\n * produce. The other possibility is to use the escape character, by default \u0027$\u0027.\n * If this character is placed before a variable reference, this reference is ignored\n * and won\u0027t be replaced. For example:\n * \u003cpre\u003e\n *   The variable $${${name}} must be used.\n * \u003c/pre\u003e\n *\n * @author Oliver Heger\n * @author Stephen Colebourne\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ESCAPE"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Constant for the default escape character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Constant for the default variable prefix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUFFIX"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Constant for the default variable suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "escapeChar"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Stores the escape character.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "prefixMatcher"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Stores the variable prefix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "suffixMatcher"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Stores the variable suffix.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "variableResolver"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Variable resolution is delegated to an implementor of VariableResolver.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(java.lang.Object, java.util.Map)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the map.\n     *\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @param valueMap  the map with the values, may be null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(java.lang.Object, java.util.Map, java.lang.String, java.lang.String)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the map. This method allows to specifiy a\n     * custom variable prefix and suffix\n     *\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @param valueMap  the map with the values, may be null\n     * @param prefix  the prefix of variables, not null\n     * @param suffix  the suffix of variables, not null\n     * @return the result of the replace operation\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replaceSystemProperties(java.lang.Object)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the system properties.\n     *\n     * @param source  the source text containing the variables to substitute, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.StrSubstitutor()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Creates a new instance with defaults for variable prefix and suffix\n     * and the escaping character.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.StrSubstitutor(java.util.Map)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Creates a new instance and initializes it. Uses defaults for variable\n     * prefix and suffix and the escaping character.\n     *\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.StrSubstitutor(java.util.Map, java.lang.String, java.lang.String)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Creates a new instance and initializes it. Uses a default escaping character.\n     *\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.StrSubstitutor(java.util.Map, java.lang.String, java.lang.String, char)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param valueMap  the map with the variables\u0027 values, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang.text.StrLookup)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang.text.StrLookup, java.lang.String, java.lang.String, char)",
      "begin_line": 225,
      "end_line": 230,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     * @param prefix  the prefix for variables, not null\n     * @param suffix  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 51)",
        "(line 227,col 9)-(line 227,col 39)",
        "(line 228,col 9)-(line 228,col 39)",
        "(line 229,col 9)-(line 229,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.StrSubstitutor(org.apache.commons.lang.text.StrLookup, org.apache.commons.lang.text.StrMatcher, org.apache.commons.lang.text.StrMatcher, char)",
      "begin_line": 241,
      "end_line": 247,
      "comment": "\n     * Creates a new instance and initializes it.\n     *\n     * @param variableResolver  the variable resolver, may be null\n     * @param prefixMatcher  the prefix for variables, not null\n     * @param suffixMatcher  the suffix for variables, not null\n     * @param escape  the escape character\n     * @throws IllegalArgumentException if the prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 51)",
        "(line 244,col 9)-(line 244,col 53)",
        "(line 245,col 9)-(line 245,col 53)",
        "(line 246,col 9)-(line 246,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(java.lang.String)",
      "begin_line": 257,
      "end_line": 266,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source string as a template.\n     *\n     * @param source  the string to replace in, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 48)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(java.lang.String, int, int)",
      "begin_line": 280,
      "end_line": 289,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source string as a template.\n     * \u003cp\u003e\n     * Only the specified portion of the string will be processed.\n     * The rest of the string is not processed, and is not returned.\n     *\n     * @param source  the string to replace in, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 79)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(char[])",
      "begin_line": 300,
      "end_line": 307,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source array as a template.\n     * The array is not altered by this method.\n     *\n     * @param source  the character array to replace in, not altered, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 70)",
        "(line 305,col 9)-(line 305,col 42)",
        "(line 306,col 9)-(line 306,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(char[], int, int)",
      "begin_line": 322,
      "end_line": 329,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source array as a template.\n     * The array is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the array will be processed.\n     * The rest of the array is not processed, and is not returned.\n     *\n     * @param source  the character array to replace in, not altered, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 79)",
        "(line 327,col 9)-(line 327,col 35)",
        "(line 328,col 9)-(line 328,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(java.lang.StringBuffer)",
      "begin_line": 340,
      "end_line": 347,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source buffer as a template.\n     * The buffer is not altered by this method.\n     *\n     * @param source  the buffer to use as a template, not changed, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 72)",
        "(line 345,col 9)-(line 345,col 41)",
        "(line 346,col 9)-(line 346,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(java.lang.StringBuffer, int, int)",
      "begin_line": 362,
      "end_line": 369,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source buffer as a template.\n     * The buffer is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, and is not returned.\n     *\n     * @param source  the buffer to use as a template, not changed, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 79)",
        "(line 367,col 9)-(line 367,col 35)",
        "(line 368,col 9)-(line 368,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 380,
      "end_line": 387,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source builder as a template.\n     * The builder is not altered by this method.\n     *\n     * @param source  the builder to use as a template, not changed, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 72)",
        "(line 385,col 9)-(line 385,col 41)",
        "(line 386,col 9)-(line 386,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(org.apache.commons.lang.text.StrBuilder, int, int)",
      "begin_line": 402,
      "end_line": 409,
      "comment": "\n     * Replaces all the occurrences of variables with their matching values\n     * from the resolver using the given source builder as a template.\n     * The builder is not altered by this method.\n     * \u003cp\u003e\n     * Only the specified portion of the builder will be processed.\n     * The rest of the builder is not processed, and is not returned.\n     *\n     * @param source  the builder to use as a template, not changed, null returns null\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the array to be processed, must be valid\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 79)",
        "(line 407,col 9)-(line 407,col 35)",
        "(line 408,col 9)-(line 408,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replace(java.lang.Object)",
      "begin_line": 420,
      "end_line": 427,
      "comment": "\n     * Replaces all the occurrences of variables in the given source object with\n     * their matching values from the resolver. The input source object is\n     * converted to a string using \u003ccode\u003etoString\u003c/code\u003e and is not altered.\n     *\n     * @param source  the source to replace in, null returns null\n     * @return the result of the replace operation\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 57)",
        "(line 425,col 9)-(line 425,col 41)",
        "(line 426,col 9)-(line 426,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replaceIn(java.lang.StringBuffer)",
      "begin_line": 438,
      "end_line": 443,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replaceIn(java.lang.StringBuffer, int, int)",
      "begin_line": 458,
      "end_line": 468,
      "comment": "\n     * Replaces all the occurrences of variables within the given source buffer\n     * with their matching values from the resolver.\n     * The buffer is updated with the result.\n     * \u003cp\u003e\n     * Only the specified portion of the buffer will be processed.\n     * The rest of the buffer is not processed, but it is not deleted.\n     *\n     * @param source  the buffer to replace in, updated, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the buffer to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 79)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 64)",
        "(line 467,col 9)-(line 467,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replaceIn(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 478,
      "end_line": 483,
      "comment": "\n     * Replaces all the occurrences of variables within the given source\n     * builder with their matching values from the resolver.\n     *\n     * @param source  the builder to replace in, updated, null returns zero\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.replaceIn(org.apache.commons.lang.text.StrBuilder, int, int)",
      "begin_line": 497,
      "end_line": 502,
      "comment": "\n     * Replaces all the occurrences of variables within the given source\n     * builder with their matching values from the resolver.\n     * \u003cp\u003e\n     * Only the specified portion of the builder will be processed.\n     * The rest of the builder is not processed, but it is not deleted.\n     *\n     * @param source  the builder to replace in, null returns zero\n     * @param offset  the start offset within the array, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.substitute(org.apache.commons.lang.text.StrBuilder, int, int)",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\n     * Internal method that substitutes the variables.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method will\n     * be called automatically by another (public) method.\n     * \u003cp\u003e\n     * Writers of subclasses can override this method if they need access to\n     * the substitution process at the start or end.\n     *\n     * @param buf  the string builder to substitute into, not null\n     * @param offset  the start offset within the builder, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @return true if altered\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.substitute(org.apache.commons.lang.text.StrBuilder, int, int, java.util.List)",
      "begin_line": 535,
      "end_line": 612,
      "comment": "\n     * Recursive handler for multiple levels of interpolation. This is the main\n     * interpolation method, which resolves the values of all variable references\n     * contained in the passed in text.\n     *\n     * @param buf  the string builder to substitute into, not null\n     * @param offset  the start offset within the builder, must be valid\n     * @param length  the length within the builder to be processed, must be valid\n     * @param priorVariables  the stack keeping track of the replaced variables, may be null\n     * @return the length change that occurs, unless priorVariables is null when the int\n     *  represents a boolean flag as to whether any change occurred.\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 62)",
        "(line 537,col 9)-(line 537,col 62)",
        "(line 538,col 9)-(line 538,col 38)",
        "(line 540,col 9)-(line 540,col 47)",
        "(line 541,col 9)-(line 541,col 32)",
        "(line 542,col 9)-(line 542,col 29)",
        "(line 543,col 9)-(line 543,col 34)",
        "(line 544,col 9)-(line 544,col 37)",
        "(line 545,col 9)-(line 545,col 25)",
        "(line 546,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.checkCyclicSubstitution(java.lang.String, java.util.List)",
      "begin_line": 620,
      "end_line": 630,
      "comment": "\n     * Checks if the specified variable is already in the stack (list) of variables.\n     *\n     * @param varName  the variable name to check\n     * @param priorVariables  the list of prior variables\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 45)",
        "(line 625,col 9)-(line 625,col 66)",
        "(line 626,col 9)-(line 626,col 45)",
        "(line 627,col 9)-(line 627,col 25)",
        "(line 628,col 9)-(line 628,col 55)",
        "(line 629,col 9)-(line 629,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.resolveVariable(java.lang.String, org.apache.commons.lang.text.StrBuilder, int, int)",
      "begin_line": 649,
      "end_line": 655,
      "comment": "\n     * Internal method that resolves the value of a variable.\n     * \u003cp\u003e\n     * Most users of this class do not need to call this method. This method is\n     * called automatically by the substitution process.\n     * \u003cp\u003e\n     * Writers of subclasses can override this method if they need to alter\n     * how each substitution occurs. The method is passed the variable\u0027s name\n     * and must return the corresponding value. This implementation uses the\n     * {@link #getVariableResolver()} with the variable\u0027s name as the key.\n     *\n     * @param variableName  the name of the variable, not null\n     * @param buf  the buffer where the substitution is occurring, not null\n     * @param startPos  the start position of the variable including the prefix, valid\n     * @param endPos  the end position of the variable including the suffix, valid\n     * @return the variable\u0027s value or \u003cb\u003enull\u003c/b\u003e if the variable is unknown\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 51)",
        "(line 651,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 654,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.getEscapeChar()",
      "begin_line": 664,
      "end_line": 666,
      "comment": "\n     * Returns the escape character.\n     *\n     * @return the character used for escaping variable references\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.setEscapeChar(char)",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\n     * Sets the escape character.\n     * If this character is placed before a variable reference in the source\n     * text, this variable will be ignored.\n     *\n     * @param escapeCharacter  the escape character (0 for disabling escaping)\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.getVariablePrefixMatcher()",
      "begin_line": 690,
      "end_line": 692,
      "comment": "\n     * Gets the variable prefix matcher currently in use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This prefix is expressed in terms of a matcher\n     * allowing advanced prefix matches.\n     *\n     * @return the prefix matcher in use\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.setVariablePrefixMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 705,
      "end_line": 711,
      "comment": "\n     * Sets the variable prefix matcher currently in use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This prefix is expressed in terms of a matcher\n     * allowing advanced prefix matches.\n     *\n     * @param prefixMatcher  the prefix matcher to use, null ignored\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the prefix matcher is null\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 43)",
        "(line 710,col 9)-(line 710,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.setVariablePrefix(char)",
      "begin_line": 723,
      "end_line": 725,
      "comment": "\n     * Sets the variable prefix to use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This method allows a single character prefix to\n     * be easily set.\n     *\n     * @param prefix  the prefix character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.setVariablePrefix(java.lang.String)",
      "begin_line": 737,
      "end_line": 742,
      "comment": "\n     * Sets the variable prefix to use.\n     * \u003cp\u003e\n     * The variable prefix is the characer or characters that identify the\n     * start of a variable. This method allows a string prefix to be easily set.\n     *\n     * @param prefix  the prefix for variables, not null\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the prefix is null\n     ",
      "child_ranges": [
        "(line 738,col 8)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.getVariableSuffixMatcher()",
      "begin_line": 755,
      "end_line": 757,
      "comment": "\n     * Gets the variable suffix matcher currently in use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This suffix is expressed in terms of a matcher\n     * allowing advanced suffix matches.\n     *\n     * @return the suffix matcher in use\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.setVariableSuffixMatcher(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 770,
      "end_line": 776,
      "comment": "\n     * Sets the variable suffix matcher currently in use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This suffix is expressed in terms of a matcher\n     * allowing advanced suffix matches.\n     *\n     * @param suffixMatcher  the suffix matcher to use, null ignored\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the suffix matcher is null\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 43)",
        "(line 775,col 9)-(line 775,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.setVariableSuffix(char)",
      "begin_line": 788,
      "end_line": 790,
      "comment": "\n     * Sets the variable suffix to use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This method allows a single character suffix to\n     * be easily set.\n     *\n     * @param suffix  the suffix character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.setVariableSuffix(java.lang.String)",
      "begin_line": 802,
      "end_line": 807,
      "comment": "\n     * Sets the variable suffix to use.\n     * \u003cp\u003e\n     * The variable suffix is the characer or characters that identify the\n     * end of a variable. This method allows a string suffix to be easily set.\n     *\n     * @param suffix  the suffix for variables, not null\n     * @return this, to enable chaining\n     * @throws IllegalArgumentException if the suffix is null\n     ",
      "child_ranges": [
        "(line 803,col 8)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.getVariableResolver()",
      "begin_line": 816,
      "end_line": 818,
      "comment": "\n     * Gets the VariableResolver that is used to lookup variables.\n     *\n     * @return the VariableResolver\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutor.setVariableResolver(org.apache.commons.lang.text.StrLookup)",
      "begin_line": 825,
      "end_line": 827,
      "comment": "\n     * Sets the VariableResolver that is used to lookup variables.\n     *\n     * @param variableResolver  the VariableResolver\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 49)"
      ]
    }
  ]
}