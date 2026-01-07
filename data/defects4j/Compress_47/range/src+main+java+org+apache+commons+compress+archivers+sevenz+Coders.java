{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/sevenz/Coders.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Coders",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CODER_MAP"
      ],
      "begin_line": 46,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.findByMethod(org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 70,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 90)",
        "(line 73,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(java.io.OutputStream, org.apache.commons.compress.archivers.sevenz.SevenZMethod, java.lang.Object)",
      "begin_line": 81,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 50)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CopyDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 90,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 91,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BCJDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 102,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "opts"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.BCJDecoder(org.tukaani.xz.FilterOptions)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 13)-(line 105,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 108,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 118,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 115)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 128,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoder()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 133,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 57)",
        "(line 139,col 13)-(line 140,col 30)",
        "(line 141,col 13)-(line 141,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 143,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 64)",
        "(line 146,col 13)-(line 146,col 64)",
        "(line 147,col 13)-(line 147,col 102)",
        "(line 148,col 13)-(line 148,col 82)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoderInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 151,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inflaterInputStream"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inflater"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderInputStream.DeflateDecoderInputStream(java.util.zip.InflaterInputStream, java.util.zip.Inflater)",
      "begin_line": 156,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 158,col 17)-(line 158,col 63)",
        "(line 159,col 17)-(line 159,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderInputStream.read()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 17)-(line 164,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderInputStream.read(byte[], int, int)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 17)-(line 169,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderInputStream.read(byte[])",
      "begin_line": 172,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 17)-(line 174,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderInputStream.close()",
      "begin_line": 177,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 179,col 17)-(line 183,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoderOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 187,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deflaterOutputStream"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deflater"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderOutputStream.DeflateDecoderOutputStream(java.util.zip.DeflaterOutputStream, java.util.zip.Deflater)",
      "begin_line": 192,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 194,col 17)-(line 194,col 65)",
        "(line 195,col 17)-(line 195,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderOutputStream.write(int)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 17)-(line 200,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderOutputStream.write(byte[])",
      "begin_line": 203,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 17)-(line 205,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderOutputStream.write(byte[], int, int)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 17)-(line 210,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderOutputStream.close()",
      "begin_line": 213,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 215,col 17)-(line 219,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Deflate64Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 224,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.Deflate64Decoder.Deflate64Decoder()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 13)-(line 226,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.Deflate64Decoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 229,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BZIP2Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 238,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.BZIP2Decoder()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 243,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 249,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 108)",
        "(line 253,col 13)-(line 253,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyByteAddingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 263,
      "end_line": 290,
      "comment": "\n     * ZLIB requires an extra dummy byte.\n     *\n     * @see java.util.zip.Inflater#Inflater(boolean)\n     * @see org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.DummyByteAddingInputStream(java.io.InputStream)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read()",
      "begin_line": 270,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 38)",
        "(line 273,col 13)-(line 276,col 13)",
        "(line 277,col 13)-(line 277,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read(byte[], int, int)",
      "begin_line": 280,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 282,col 13)-(line 282,col 55)",
        "(line 283,col 13)-(line 287,col 13)",
        "(line 288,col 13)-(line 288,col 26)"
      ]
    }
  ]
}