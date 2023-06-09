package com.motoapp.models

sealed class ItemBikeDescription (
    val title: String,
    val listOfImages: List<String>,
    val model: String,
    val year: String,
    val category: String,
    val engineAndTransmission: String,
    val engineCapacity: String,
    val engineType: String,
    val enginePower: String,
    val cylinderPiston: String,
    val fuelSystem: String,
    val engineIgnition: String,
    val lubricationSystem: String,
    val coolingSystem: String,
    val transmission: String,
    val engineDrive: String,
    val clutch: String,
    val chassisSuspensionBrakesAndWheels: String,
    val frameType: String,
    val frontCorner: String,
    val frontSuspension: String,
    val frontWheelTravel: String,
    val rearSuspension: String,
    val rearWheelTravel: String,
    val frontBrake: String,
    val rearBrake: String,
    val physicalCharacteristicsAndCapacity: String,
    val dryWieght: String,
    val powerMassRatio: String,
    val seatHeight: String,
    val clearance: String,
    val fuelTankCapacity: String,
    val otherSpecifications: String,
    val dryWeight: String
){
    // Ekzempliary klasa ItemBikeDescription (nashi motyky)
    object Ktm450SXF2024: ItemBikeDescription(
        title = "KTM 450 SX-F 2024",
        listOfImages = listOf(
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_RE_496212-MY24-KTM-450-SX-F-90-Right-Studio_%23SALL_%23AEPI_%23V1.png",
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_REHI_MY24-KTM-450-SX-F-rear-right-Studio_%23SALL_%23AEPI_%23V1.png",
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_LIHI_MY24-KTM-450-SX-F-rear-Left-Studio_%23SALL_%23AEPI_%23V1.png",
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_LI_MY24-KTM-450-SX-F-90-Left-Studio_%23SALL_%23AEPI_%23V1.png",
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_LIVO_MY24-KTM-450-SX-F-Front-Left-Studio_%23SALL_%23AEPI_%23V1.png",
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_REVO_MY24-KTM-450-SX-F-Front-right-Studio_%23SALL_%23AEPI_%23V1.png",
        ),
        model = "Model: 450 SX-F",
        year = "Year: 2024",
        category = "Category: MX",
        engineAndTransmission = "ENGINE and TRANSMISSION",
        engineCapacity = "Engine capacity : 449.9 cm3 (27.45 cubic inches)",
        engineType = "Engine type : Single cylinder, 4-stroke",
        enginePower = "Engine power : 63.0 HP (46.0 kW)",
        cylinderPiston = "Cylinder x Piston : 95.0 x 63.4 mm (3.7 x 2.5 inches)",
        fuelSystem = "Fuel System : Injection",
        lubricationSystem = "Fuel Supply System : Single Overhead Cams (SOHC)",
        engineIgnition = "Engine Ignition : Keihin EMS",
        coolingSystem = "Cooling System : Liquid",
        transmission = "Transmission : 5-Speed",
        engineDrive = "Engine drive : X-Ring 5/8 x 1/4 chain",
        clutch = "Clutch : Wet, DDS multi-disc clutch, Brembo Hydraulics",
        chassisSuspensionBrakesAndWheels = "CHASSIS, SUSPENSION, BRAKES and WHEELS",
        frameType = "Frame Type : Central double-cradle-type 25CrMo4 steel",
        frontCorner = "Front Corner (Fork Angle) : 26.1\u00B0",
        frontSuspension = "Front Suspension : WP XACT-USD, A 48 mm",
        frontWheelTravel = "Front Wheel Travel : 310 mm (12.2 inches)",
        rearSuspension = "Rear Suspension : WP XACT Monoshock with linkage",
        rearWheelTravel = "Rear Wheel Travel : 300 mm (11.8 inches)",
        frontBrake = "Front Brake : Single disc. Brake calipers on floating bearings",
        rearBrake = "Rear brake : Single disc. Brake calipers on floating bearings",
        physicalCharacteristicsAndCapacity = "PHYSICAL CHARACTERISTICS and CAPACITY",
        dryWeight = "Dry Weight : 102.6 kg (226.2 pounds)",
        powerMassRatio = "Power / Mass Ratio : 0.6140 HP / kg",
        seatHeight = "Seat Height: 958 mm (37.7 inches). If adjustable, lowest settings.",
        clearance = "Clearance : 343 mm (13.5 inches)",
        fuelTankCapacity = "Fuel Tank Capacity : 7.20 litres (1.90 US gallons",
        otherSpecifications = "OTHER SPECIFICATIONS",
        dryWieght = "Starter : Electric",
    )

    object Ktm125SX2024: ItemBikeDescription(
        title = "KTM 125 SX 2024",
        listOfImages = listOf(
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_RE_MY24-KTM-125-SX-90-Right-Studio_%23SALL_%23AEPI_%23V1.png",
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_LI_MY24-KTM-125-SX-90-Left-Studio_%23SALL_%23AEPI_%23V1.png",
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_LIHI_MY24-KTM-125-SX-Rear-Left-Studio_%23SALL_%23AEPI_%23V1.png",
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_LIVO_MY24-KTM-125-SX-Front-Left-Studio_%23SALL_%23AEPI_%23V1.png",
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_REHI_MY24-KTM-125-SX-Rear-Right-Studio_%23SALL_%23AEPI_%23V1.png",
            "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_REVO_MY24-KTM-125-SX-Front-Right-Studio_%23SALL_%23AEPI_%23V1.png",
        ),
        model = "Model: 125 SX",
        year = "Year: 2024",
        category = "Category: MX",
        engineAndTransmission = "ENGINE and TRANSMISSION",
        engineCapacity = "Engine capacity : 124.8 cm3 (7.62 cubic inches)",
        engineType = "Engine type : Single cylinder, 2-stroke",
        enginePower = "Engine power : 15.0 HP (10.9 kW)",
        cylinderPiston = "Cylinder x Piston : 54.0 x 54.5 mm (2.1 x 2.1 inches)",
        fuelSystem = "Fuel System : Injection",
        engineIgnition = "Engine Ignition : Vitesco Technologies EMS",
        lubricationSystem = "Lubrication System : Wet sump",
        coolingSystem = "Cooling System : Liquid",
        transmission = "Transmission : 6-Speed",
        engineDrive = "Engine drive : X-Ring 5/8 x 1/4 chain",
        clutch = "Clutch : Wet multi-disc DS clutch, Brembo Hydraulics",
        chassisSuspensionBrakesAndWheels = "CHASSIS, SUSPENSION, BRAKES and WHEELS",
        frameType = "Frame Type : Central double-cradle-type 25CrMo4 steel",
        frontCorner = "Front Corner (Fork Angle) : 26.1\u00B0",
        frontSuspension = "Front Suspension : WP XACT-USD, A 48 mm",
        frontWheelTravel = "Front Wheel Travel : 310 mm (12.2 inches)",
        rearSuspension = "Rear Suspension : WP XACT Monoshock with linkage",
        rearWheelTravel = "Rear Wheel Travel : 300 mm (11.8 inches)",
        frontBrake = "Front Brake : Single disc",
        rearBrake = "Rear brake : Single disc",
        physicalCharacteristicsAndCapacity = "PHYSICAL CHARACTERISTICS and CAPACITY",
        dryWeight = "Dry Weight : 92.4 kg (203.7 pounds)",
        powerMassRatio = "Power / Mass Ratio : 0.1623 HP / kg",
        seatHeight = "Seat Height: 958 mm (37.7 inches). If adjustable, lowest settings.",
        clearance = "Clearance : 359 mm (14.1 inches)",
        fuelTankCapacity = "Fuel Tank Capacity : 7.20 litres (1.90 US gallons",
        otherSpecifications = "OTHER SPECIFICATIONS",
        dryWieght = "Dry Weight : 92.4 kg (203.7 pounds)",
    )

}