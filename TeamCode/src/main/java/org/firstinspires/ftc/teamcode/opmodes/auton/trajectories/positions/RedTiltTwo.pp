{
  "startPoint": {
    "x": 62.4,
    "y": 8.4,
    "locked": false,
    "headingDeg": 90
  },
  "lines": [
    {
      "id": "line-mu7djw6w-nz32ld",
      "color": "#8BB79C",
      "name": "firstShoot",
      "locked": false,
      "waitBeforeMs": 0,
      "waitAfterMs": 0,
      "waitBeforeName": "",
      "waitAfterName": "",
      "kind": "atomic",
      "endPoint": {
        "x": 39.4,
        "y": 18.1
      },
      "controlPoints": [],
      "heading": {
        "type": "linear",
        "reverse": true,
        "startDeg": 90,
        "endDeg": 58
      }
    },
    {
      "id": "line-mu68qtm2-5pc72b",
      "color": "#ffc516",
      "name": "intakeFirst",
      "locked": false,
      "waitBeforeMs": 0,
      "waitAfterMs": 0,
      "waitBeforeName": "",
      "waitAfterName": "",
      "kind": "atomic",
      "endPoint": {
        "x": 11.34,
        "y": 41.14
      },
      "controlPoints": [
        {
          "x": 27.052109704641342,
          "y": 40.69219409282702
        }
      ],
      "heading": {
        "type": "linear",
        "startDeg": 58,
        "endDeg": 135
      }
    },
    {
      "id": "line-mu68u96k-1oyslf",
      "color": "#67965D",
      "name": "shootSecond",
      "locked": false,
      "waitBeforeMs": 0,
      "waitAfterMs": 0,
      "waitBeforeName": "",
      "waitAfterName": "",
      "kind": "atomic",
      "endPoint": {
        "x": 39.5,
        "y": 123.66160337552742
      },
      "controlPoints": [
        {
          "x": 29.25,
          "y": 47.38502109704642
        },
        {
          "x": 28.536919831223624,
          "y": 109.17932489451476
        }
      ],
      "heading": {
        "type": "linear",
        "reverse": true,
        "startDeg": 135,
        "endDeg": -58
      }
    },
    {
      "id": "line-mu6904u2-8sxn7n",
      "color": "#559ADA",
      "name": "intakeSecond",
      "locked": false,
      "waitBeforeMs": 0,
      "waitAfterMs": 0,
      "waitBeforeName": "",
      "waitAfterName": "",
      "kind": "atomic",
      "endPoint": {
        "x": 47.59704641350213,
        "y": 128.9940928270043
      },
      "controlPoints": [
        {
          "x": 41.90717299578057,
          "y": 107.94409282700424
        }
      ],
      "heading": {
        "type": "linear",
        "reverse": true,
        "startDeg": -58,
        "endDeg": 90
      }
    },
    {
      "id": "line-mu6957oy-b4ytwf",
      "color": "#96868C",
      "name": "shootThird",
      "locked": false,
      "waitBeforeMs": 0,
      "waitAfterMs": 0,
      "waitBeforeName": "",
      "waitAfterName": "",
      "kind": "atomic",
      "endPoint": {
        "x": 39.206329113924056,
        "y": 124.0132911392405
      },
      "controlPoints": [
        {
          "x": 42.059071729957786,
          "y": 107.67405063291139
        }
      ],
      "heading": {
        "type": "linear",
        "reverse": true,
        "startDeg": 90,
        "endDeg": -58
      }
    },
    {
      "id": "line-mu697ys5-b0b4ty",
      "color": "#ADD588",
      "name": "park",
      "locked": false,
      "waitBeforeMs": 0,
      "waitAfterMs": 0,
      "waitBeforeName": "",
      "waitAfterName": "",
      "kind": "atomic",
      "endPoint": {
        "x": 16.178523206751056,
        "y": 115.39852320675105
      },
      "controlPoints": [],
      "heading": {
        "type": "linear",
        "reverse": true,
        "startDeg": -58,
        "endDeg": -58
      }
    }
  ],
  "shapes": [
    {
      "id": "triangle-1",
      "name": "Red Goal",
      "vertices": [
        {
          "x": 141.5,
          "y": 70
        },
        {
          "x": 141.5,
          "y": 141.5
        },
        {
          "x": 118.3,
          "y": 141.5
        },
        {
          "x": 135.5,
          "y": 118
        },
        {
          "x": 136.3,
          "y": 70.2
        }
      ],
      "color": "#dc2626",
      "fillColor": "#ff6b6b"
    },
    {
      "id": "triangle-2",
      "name": "Blue Goal",
      "vertices": [
        {
          "x": 6.2,
          "y": 116.9
        },
        {
          "x": 25,
          "y": 141.5
        },
        {
          "x": 0,
          "y": 141.5
        },
        {
          "x": 0,
          "y": 70
        },
        {
          "x": 6,
          "y": 70
        }
      ],
      "color": "#2563eb",
      "fillColor": "#60a5fa"
    }
  ],
  "sequence": [
    {
      "kind": "path",
      "lineId": "line-mu7djw6w-nz32ld"
    },
    {
      "kind": "path",
      "lineId": "line-mu68qtm2-5pc72b"
    },
    {
      "kind": "path",
      "lineId": "line-mu68u96k-1oyslf"
    },
    {
      "kind": "path",
      "lineId": "line-mu6904u2-8sxn7n"
    },
    {
      "kind": "path",
      "lineId": "line-mu6957oy-b4ytwf"
    },
    {
      "kind": "path",
      "lineId": "line-mu697ys5-b0b4ty"
    }
  ],
  "fieldPoints": [],
  "version": "1.5.0",
  "timestamp": "2026-09-24T23:55:42.714Z"
}