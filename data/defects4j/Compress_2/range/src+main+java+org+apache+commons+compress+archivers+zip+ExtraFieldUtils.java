{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtraFieldUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 186,
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
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data as local file data.\n     * @param data an array of bytes as it appears in local file data\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byte[], boolean)",
      "begin_line": 107,
      "end_line": 137,
      "comment": "\n     * Split the array into ExtraFields and populate them with the\n     * given data.\n     * @param data an array of bytes\n     * @param local whether data originates from the local file data\n     * or the central directory\n     * @return an array of ExtraFields\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 33)",
        "(line 110,col 9)-(line 110,col 22)",
        "(line 111,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 61)",
        "(line 136,col 9)-(line 136,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 144,
      "end_line": 161,
      "comment": "\n     * Merges the local file data fields of the given ZipExtraFields.\n     * @param data an array of ExtraFiles\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 37)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 38)",
        "(line 150,col 9)-(line 150,col 22)",
        "(line 151,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(org.apache.commons.compress.archivers.zip.ZipExtraField[])",
      "begin_line": 168,
      "end_line": 185,
      "comment": "\n     * Merges the central directory fields of the given ZipExtraFields.\n     * @param data an array of ExtraFields\n     * @return an array of bytes\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 37)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 38)",
        "(line 174,col 9)-(line 174,col 22)",
        "(line 175,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 22)"
      ]
    }
  ]
}