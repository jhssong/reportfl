{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtraFieldUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 305,
      "comment": " CheckStyle:HideUtilityClassConstructorCheck OFF (bc)"
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "implementations"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Static registry of known extra fields.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.register(java.lang.Class)",
      "begin_line": 55,
      "end_line": 66,
      "comment": "\n     * Register a ZipExtraField implementation.\n     *\n     * \u003cp\u003eThe given class must have a no-arg constructor and implement\n     * the {@link ZipExtraField ZipExtraField interface}.\u003c/p\u003e\n     * @param c the class to register\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 65,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 76,
      "end_line": 85,
      "comment": "\n     * Create an instance of the approriate ExtraField, falls back to\n     * {@link UnrecognizedExtraField UnrecognizedExtraField}.\n     * @param headerId the header identifier\n     * @return an instance of the appropiate ExtraField\n     * @exception InstantiationException if unable to instantiate the class\n     * @exception IllegalAccessException if not allowed to instatiate the class\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 56)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 64)",
        "(line 83,col 9)-(line 83,col 32)",
        "(line 84,col 9)-(line 84,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[])",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data as local file data, throwing an exception if the\n     * data cannot be parsed.\n     * @param data an array of bytes as it appears in local file data\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[], boolean)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data, throwing an exception if the data cannot be parsed.\n     * @param data an array of bytes\n     * @param local whether data originates from the local file data\n     * or the central directory\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[], boolean, org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField)",
      "begin_line": 126,
      "end_line": 185,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data.\n     * @param data an array of bytes\n     * @param local whether data originates from the local file data\n     * or the central directory\n     * @param onUnparseableData what to do if the extra field data\n     * cannot be parsed.\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     *\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 33)",
        "(line 130,col 9)-(line 130,col 22)",
        "(line 131,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 61)",
        "(line 184,col 9)-(line 184,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 192,
      "end_line": 219,
      "comment": "\n     * Merges the local file data fields of the given ZipExtraFields.\n     * @param data an array of ExtraFiles\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 194,col 74)",
        "(line 195,col 9)-(line 196,col 68)",
        "(line 198,col 9)-(line 198,col 48)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 38)",
        "(line 204,col 9)-(line 204,col 22)",
        "(line 205,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 226,
      "end_line": 252,
      "comment": "\n     * Merges the central directory fields of the given ZipExtraFields.\n     * @param data an array of ExtraFields\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 228,col 74)",
        "(line 229,col 9)-(line 230,col 68)",
        "(line 232,col 9)-(line 232,col 48)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 38)",
        "(line 237,col 9)-(line 237,col 22)",
        "(line 238,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnparseableExtraField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 260,
      "end_line": 304,
      "comment": "\n     * \"enum\" for the possible actions to take if the extra field\n     * cannot be parsed.\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THROW_KEY"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": "\n         * Key for \"throw an exception\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_KEY"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": "\n         * Key for \"skip\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "READ_KEY"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": "\n         * Key for \"read\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "THROW"
      ],
      "begin_line": 277,
      "end_line": 278,
      "comment": "\n         * Throw an exception if field cannot be parsed.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP"
      ],
      "begin_line": 284,
      "end_line": 285,
      "comment": "\n         * Skip the extra field entirely and don\u0027t make its data\n         * available - effectively removing the extra field data.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "READ"
      ],
      "begin_line": 291,
      "end_line": 292,
      "comment": "\n         * Read the extra field data into an instance of {@link\n         * UnparseableExtraFieldData UnparseableExtraFieldData}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.UnparseableExtraField(int)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 297,col 13)-(line 297,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.getKey()",
      "begin_line": 303,
      "end_line": 303,
      "comment": "\n         * Key of the action to take.\n         ",
      "child_ranges": [
        "(line 303,col 31)-(line 303,col 41)"
      ]
    }
  ]
}