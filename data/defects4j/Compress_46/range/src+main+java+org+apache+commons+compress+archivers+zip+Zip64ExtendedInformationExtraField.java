{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Zip64ExtendedInformationExtraField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 43,
      "end_line": 340,
      "comment": "\n * Holds size and other extended information for entries that use Zip64\n * features.\n *\n * \u003cp\u003eCurrently Commons Compress doesn\u0027t support encrypting the\n * central directory so the note in APPNOTE.TXT about masking doesn\u0027t\n * apply.\u003c/p\u003e\n *\n * \u003cp\u003eThe implementation relies on data being read from the local file\n * header and assumes that both size values are always present.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://www.pkware.com/documents/casestudies/APPNOTE.TXT\"\u003ePKWARE\n * APPNOTE.TXT, section 4.5.3\u003c/a\u003e\n *\n * @since 1.2\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_MUST_HAVE_BOTH_SIZES_MSG"
      ],
      "begin_line": 47,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size",
        "compressedSize",
        "relativeHeaderOffset"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "diskStart"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawCentralDirectoryData"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Stored in {@link #parseFromCentralDirectoryData\n     * parseFromCentralDirectoryData} so it can be reused when ZipFile\n     * calls {@link #reparseCentralDirectoryData\n     * reparseCentralDirectoryData}.\n     *\n     * \u003cp\u003eNot used for anything else\u003c/p\u003e\n     *\n     * @since 1.3\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * This constructor should only be used by the code that reads\n     * archives inside of Commons Compress.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField(org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Creates an extra field based on the original and compressed size.\n     *\n     * @param size the entry\u0027s original size\n     * @param compressedSize the entry\u0027s compressed size\n     *\n     * @throws IllegalArgumentException if size or compressedSize is null\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.Zip64ExtendedInformationExtraField(org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipEightByteInteger, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 96,
      "end_line": 104,
      "comment": "\n     * Creates an extra field based on all four possible values.\n     *\n     * @param size the entry\u0027s original size\n     * @param compressedSize the entry\u0027s compressed size\n     * @param relativeHeaderOffset the entry\u0027s offset\n     * @param diskStart the disk start\n     *\n     * @throws IllegalArgumentException if size or compressedSize is null\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 25)",
        "(line 101,col 9)-(line 101,col 45)",
        "(line 102,col 9)-(line 102,col 57)",
        "(line 103,col 9)-(line 103,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getHeaderId()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataLength()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryLength()",
      "begin_line": 116,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 121,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData()",
      "begin_line": 124,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData()",
      "begin_line": 137,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 77)",
        "(line 140,col 9)-(line 140,col 33)",
        "(line 141,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 152,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 55)",
        "(line 166,col 9)-(line 166,col 24)",
        "(line 167,col 9)-(line 167,col 65)",
        "(line 168,col 9)-(line 168,col 24)",
        "(line 169,col 9)-(line 169,col 43)",
        "(line 170,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 182,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 51)",
        "(line 188,col 9)-(line 188,col 77)",
        "(line 196,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.reparseCentralDirectoryData(boolean, boolean, boolean, boolean)",
      "begin_line": 224,
      "end_line": 262,
      "comment": "\n     * Parses the raw bytes read from the central directory extra\n     * field with knowledge which fields are expected to be there.\n     *\n     * \u003cp\u003eAll four fields inside the zip64 extended information extra\n     * field are optional and must only be present if their corresponding\n     * entry inside the central directory contains the correct magic\n     * value.\u003c/p\u003e\n     *\n     * @param hasUncompressedSize flag to read from central directory\n     * @param hasCompressedSize flag to read from central directory\n     * @param hasRelativeHeaderOffset flag to read from central directory\n     * @param hasDiskStart flag to read from central directory\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getSize()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     * @return The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     * @param size The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCompressedSize()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * The compressed size stored in this extra field.\n     * @return The compressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setCompressedSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * The uncompressed size stored in this extra field.\n     * @param compressedSize The uncompressed size stored in this extra field.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getRelativeHeaderOffset()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * The relative header offset stored in this extra field.\n     * @return The relative header offset stored in this extra field.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setRelativeHeaderOffset(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * The relative header offset stored in this extra field.\n     * @param rho The relative header offset stored in this extra field.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getDiskStartNumber()",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * The disk start number stored in this extra field.\n     * @return The disk start number stored in this extra field.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setDiskStartNumber(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * The disk start number stored in this extra field.\n     * @param ds The disk start number stored in this extra field.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(byte[])",
      "begin_line": 328,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 20)",
        "(line 330,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 19)"
      ]
    }
  ]
}