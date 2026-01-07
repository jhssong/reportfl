{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtraFieldUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 307,
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
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.register(java.lang.Class\u003c?\u003e)",
      "begin_line": 56,
      "end_line": 67,
      "comment": "\n     * Register a ZipExtraField implementation.\n     *\n     * \u003cp\u003eThe given class must have a no-arg constructor and implement\n     * the {@link ZipExtraField ZipExtraField interface}.\u003c/p\u003e\n     * @param c the class to register\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(org.apache.commons.compress.archivers.zip.ZipShort)",
      "begin_line": 77,
      "end_line": 86,
      "comment": "\n     * Create an instance of the approriate ExtraField, falls back to\n     * {@link UnrecognizedExtraField UnrecognizedExtraField}.\n     * @param headerId the header identifier\n     * @return an instance of the appropiate ExtraField\n     * @exception InstantiationException if unable to instantiate the class\n     * @exception IllegalAccessException if not allowed to instatiate the class\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 51)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 64)",
        "(line 84,col 9)-(line 84,col 32)",
        "(line 85,col 9)-(line 85,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[])",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data as local file data, throwing an exception if the\n     * data cannot be parsed.\n     * @param data an array of bytes as it appears in local file data\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[], boolean)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data, throwing an exception if the data cannot be parsed.\n     * @param data an array of bytes\n     * @param local whether data originates from the local file data\n     * or the central directory\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[], boolean, org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField)",
      "begin_line": 127,
      "end_line": 187,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data.\n     * @param data an array of bytes\n     * @param local whether data originates from the local file data\n     * or the central directory\n     * @param onUnparseableData what to do if the extra field data\n     * cannot be parsed.\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     *\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 63)",
        "(line 132,col 9)-(line 132,col 22)",
        "(line 133,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 61)",
        "(line 186,col 9)-(line 186,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 194,
      "end_line": 221,
      "comment": "\n     * Merges the local file data fields of the given ZipExtraFields.\n     * @param data an array of ExtraFiles\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 196,col 74)",
        "(line 197,col 9)-(line 198,col 68)",
        "(line 200,col 9)-(line 200,col 48)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 38)",
        "(line 206,col 9)-(line 206,col 22)",
        "(line 207,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 228,
      "end_line": 254,
      "comment": "\n     * Merges the central directory fields of the given ZipExtraFields.\n     * @param data an array of ExtraFields\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 230,col 74)",
        "(line 231,col 9)-(line 232,col 68)",
        "(line 234,col 9)-(line 234,col 48)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 38)",
        "(line 239,col 9)-(line 239,col 22)",
        "(line 240,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnparseableExtraField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 262,
      "end_line": 306,
      "comment": "\n     * \"enum\" for the possible actions to take if the extra field\n     * cannot be parsed.\n     *\n     * @since Apache Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THROW_KEY"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": "\n         * Key for \"throw an exception\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_KEY"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": "\n         * Key for \"skip\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "READ_KEY"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": "\n         * Key for \"read\" action.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "THROW"
      ],
      "begin_line": 279,
      "end_line": 280,
      "comment": "\n         * Throw an exception if field cannot be parsed.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP"
      ],
      "begin_line": 286,
      "end_line": 287,
      "comment": "\n         * Skip the extra field entirely and don\u0027t make its data\n         * available - effectively removing the extra field data.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "READ"
      ],
      "begin_line": 293,
      "end_line": 294,
      "comment": "\n         * Read the extra field data into an instance of {@link\n         * UnparseableExtraFieldData UnparseableExtraFieldData}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.UnparseableExtraField(int)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.getKey()",
      "begin_line": 305,
      "end_line": 305,
      "comment": "\n         * Key of the action to take.\n         ",
      "child_ranges": [
        "(line 305,col 31)-(line 305,col 41)"
      ]
    }
  ]
}